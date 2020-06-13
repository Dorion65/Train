package ChessPiece;

import java.util.List;

import ChessBoard.Board;
import ChessBoard.Move;
import ChessUtility.Alliance;

public abstract class ChessPiece {
	
	protected final int tile_ID;
	protected final Alliance pieceColour;
	
	ChessPiece (final int tile_ID, final Alliance pieceColour)
	{
		this.pieceColour = pieceColour;
		this.tile_ID = tile_ID;
	}
	
	public Alliance getColour()
	{
		return this.pieceColour;
	}
	
	public abstract List<Move> calculateLegalMoves(final Board board);

}
