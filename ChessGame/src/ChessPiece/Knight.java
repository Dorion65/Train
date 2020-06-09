package ChessPiece;

import java.util.ArrayList;
import java.util.List;

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
		return null;
	
	int possibleDestinationID;
	final List<Move> legalMoves = new ArrayList<>();
	
	
	for(final int currentCoordinate : POSSIBLE_MOVE_COORDINATES)
	{
		possibleDestinationID = this.tile_ID + currentCoordinate;
		
		if(true /*ValidCoordinate*/)
		{
			final ChessTile possibleDestinationID = board.getTile(possibleDestinationID);
			if(!possibleDestinationID.isOccupied())
			{
				legalMoves.add(new Move());
			}
			else 
			{
				final ChessPiece pieceAtDestination = possibleDestinationID.getPiece();
				final Alliance pieceColour = pieceAtDestination.getColour();
			}
		}
	}
}

	


