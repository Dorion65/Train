package ChessBoard;

import ChessPiece.ChessPiece;

public abstract class Move {
	
	final Board board;
	final ChessPiece movedPiece;
	final int destinationCoordinates;
	
	Move(final Board board, final ChessPiece movedPiece, final int destinationCoordinate)
	{
		this.board = board;
		this.destinationCoordinates = destinationCoordinate;
		this.movedPiece = movedPiece;
	}
	
public static final class MajorMove extends Move
{
	public MajorMove(Board board, ChessPiece movedPiece, int destinationCoordinate)
	{
		
		super(board, movedPiece, destinationCoordinate);
	}
}

public static final class AttackMove extends Move
{
	final ChessPiece attackedPiece;
	
	public AttackMove(Board board, ChessPiece movedPiece, final ChessPiece attackedPiece, int destinationCoordinate)
	{
		super(board, movedPiece, destinationCoordinate);
		this.attackedPiece = attackedPiece;
	}
}
	
	

}
