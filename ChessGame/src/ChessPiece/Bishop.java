package ChessPiece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ChessBoard.Board;
import ChessBoard.BoardUtility;
import ChessBoard.ChessTile;
import ChessBoard.Move;
import ChessUtility.Alliance;

public class Bishop extends ChessPiece {
	
	private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-9,-7,7,9};

	Bishop(int tile_ID, Alliance pieceColour) {
		super(tile_ID, pieceColour);
	}

	@Override
	public List<Move> calculateLegalMoves(Board board) 
	{
		final List<Move> legalMoves = new ArrayList<>();
				
		for(final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES)
		{
			
			int candidateDestinationCoordinate = this.tile_ID;
			
			while(BoardUtility.isValidTileID(candidateDestinationCoordinate))
			{
				
				if(isFirstColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset) || 
						isEigthColumnExclusion(candidateCoordinateOffset, candidateCoordinateOffset))
				{break;}
				candidateDestinationCoordinate += candidateCoordinateOffset;
				
				if(BoardUtility.isValidTileID(candidateDestinationCoordinate))
				{
					
					final ChessTile possibleDestinationTile = board.getTile(candidateDestinationCoordinate);
					if(!possibleDestinationTile.isOccupied())
					{
						legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
					}
					else 
					{
						final ChessPiece pieceAtDestination = possibleDestinationTile.getPiece();
						final Alliance pieceColour = pieceAtDestination.getColour();
						
						if(this.pieceColour != pieceColour)
						{
							legalMoves.add(new Move.AttackMove(board, this, pieceAtDestination, candidateDestinationCoordinate));
						}
						break;
					}
					
				}
			}
		}
		
		Collections.unmodifiableList(legalMoves);
		return legalMoves;
	}
	
	private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset)
	{
		return BoardUtility.FIRST_COLUMN[currentPosition] && (candidateOffset == -9 || candidateOffset == 7);
	}
	
	private static boolean isEigthColumnExclusion(final int currentPosition, final int candidateOffset)
	{
		return BoardUtility.FIRST_COLUMN[currentPosition] && (candidateOffset == 9 || candidateOffset == -7);
	}

}


