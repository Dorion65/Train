package ChessPiece;

import java.util.ArrayList;
import java.util.List;

import ChessBoard.Board;
import ChessBoard.BoardUtility;
import ChessBoard.Move;
import ChessUtility.Alliance;

public class Pawn extends ChessPiece {

	private final static int[] CANDIDATE_MOVE_COORDINATE = {8};
	
	Pawn(int tile_ID, Alliance pieceColour) {
		super(tile_ID, pieceColour);

	}

	@Override
	public List<Move> calculateLegalMoves(Board board) {
		final List<Move> legalMoves = new ArrayList<>();
		
		for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE)
		{
			int candidateDestinationCoordinate = this.tile_ID + this.getColour().getDirection() * (currentCandidateOffset);
			
			if(!BoardUtility.isValidTileID(candidateDestinationCoordinate))
			{
				continue;
			}
			
			if(currentCandidateOffset == 8 && !Board.getTile(candidateDestinationCoordinate).isOccupied())
			{
				legalMoves.add(new Move.MajorMove(board, this, currentCandidateOffset));
			}
		}
		return legalMoves;
	}

}
