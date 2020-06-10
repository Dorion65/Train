package ChessPiece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ChessBoard.BoardUtility;
import ChessBoard.ChessTile;
import ChessUtility.Alliance;

public class Knight extends ChessPiece {
	
	private final static int[] POSSIBLE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};

	//Springer,Pferd,Ritter, etc.
	Knight(final int tile_ID, final Alliance pieceColour) {
		super(tile_ID, pieceColour);
	}

	@Override
	public List<Move> calculateLegalMoves(Board board) {
	
	int possibleDestinationID;
	final List<Move> legalMoves = new ArrayList<>();
	
	
	for(final int currentCoordinateOffset : POSSIBLE_MOVE_COORDINATES)
	{
		possibleDestinationID = this.tile_ID + currentCoordinateOffset;
		
		if(BoardUtility.isValidTileID(possibleDestinationID))
		{
			if(isFirstColummExclusion(this.tile_ID, currentCoordinateOffset))
			{
				continue;
			}
			
			final ChessTile possibleDestinationTile = board.getTile(possibleDestinationID);
			if(!possibleDestinationTile.isOccupied())
			{
				legalMoves.add(new Move());
			}
			else 
			{
				final ChessPiece pieceAtDestination = possibleDestinationTile.getPiece();
				final Alliance pieceColour = pieceAtDestination.getColour();
				
				if(this.pieceColour != pieceColour)
				{
					legalMoves.add(new Move());
				}
			}
		}
		
	}
	Collections.unmodifiableList(legalMoves);
	return legalMoves;
}
	private static boolean isFirstColummExclusion(final int currentTile_ID, final int candidateOffset)
	{
		return BoardUtility.FIRST_COLUMM[currentTile_ID] && ((candidateOffset == -17 || candidateOffset == -10 ||
				candidateOffset == 6 || candidateOffset == 15));
	}
}

	


