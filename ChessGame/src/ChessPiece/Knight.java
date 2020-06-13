package ChessPiece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ChessBoard.Board;
import ChessBoard.BoardUtility;
import ChessBoard.ChessTile;
import ChessBoard.Move;
import ChessUtility.Alliance;

public class Knight extends ChessPiece {
	
	private final static int[] POSSIBLE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};

	//Springer,Pferd,Ritter, etc.
	Knight(final int tile_ID, final Alliance pieceColour) {
		super(tile_ID, pieceColour);
	}

	@Override
	public List<Move> calculateLegalMoves(Board board) {
	
	final List<Move> legalMoves = new ArrayList<>();
	
	
	for(final int currentCoordinateOffset : POSSIBLE_MOVE_COORDINATES)
	{
		final int possibleDestinationID = this.tile_ID + currentCoordinateOffset;
		
		if(BoardUtility.isValidTileID(possibleDestinationID))
		{
			if(isFirstColummExclusion(this.tile_ID, currentCoordinateOffset) ||
					isSecoundColummExclusion(this.tile_ID, currentCoordinateOffset) ||
					isSeventhColummExclusion(this.tile_ID, currentCoordinateOffset) ||
					isEigthColummExclusion(this.tile_ID, currentCoordinateOffset))
			{
				continue;
			}
			
			final ChessTile possibleDestinationTile = board.getTile(possibleDestinationID);
			if(!possibleDestinationTile.isOccupied())
			{
				legalMoves.add(new Move.MajorMove(board, this, possibleDestinationID));
			}
			else 
			{
				final ChessPiece pieceAtDestination = possibleDestinationTile.getPiece();
				final Alliance pieceColour = pieceAtDestination.getColour();
				
				if(this.pieceColour != pieceColour)
				{
					legalMoves.add(new Move.AttackMove(board, this, pieceAtDestination, possibleDestinationID));
				}
			}
		}
		
	}
	Collections.unmodifiableList(legalMoves);
	return legalMoves;
}
	private static boolean isFirstColummExclusion(final int currentTile_ID, final int candidateOffset)
	{
		return BoardUtility.FIRST_COLUMN[currentTile_ID] && ((candidateOffset == -17 || candidateOffset == -10 ||
				candidateOffset == 6 || candidateOffset == 15));
	}
	
	private static boolean isSecoundColummExclusion(final int currentTile_ID, final int candidateOffset)
	{
		return BoardUtility.SECOUND_COLUMN[currentTile_ID] && ((candidateOffset == -10 || candidateOffset == 6));
	}
	
	private static boolean isSeventhColummExclusion(final int currentTile_ID, final int candidateOffset)
	{
		return BoardUtility.SEVENTH_COLUMN[currentTile_ID] && ((candidateOffset == 10 || candidateOffset == -6));
	}
	
	private static boolean isEigthColummExclusion(final int currentTile_ID, final int candidateOffset)
	{
		return BoardUtility.EIGTH_COLUMN[currentTile_ID] && ((candidateOffset == 17 || candidateOffset == 10 ||
				candidateOffset == -6 || candidateOffset == -15));
	}

	}


	


