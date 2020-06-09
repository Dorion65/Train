package ChessBoard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import ChessPiece.ChessPiece;

public abstract class ChessTile {
	
	protected final int tile_ID;
	
	private static final Map<Integer, EmptyChessTile> EMPTY_CHESS_TILES = createAllPossibleEmptyChessTiles();
	
	private static Map<Integer, EmptyChessTile> createAllPossibleEmptyChessTiles()
	{
		final Map<Integer, EmptyChessTile> emptyChessTileMap = new HashMap<>();
		
		for (int i = 0; i < 64; i++)
		{
			emptyChessTileMap.put(i, new EmptyChessTile(i));
		}
		Collections.unmodifiableMap(emptyChessTileMap);
		return emptyChessTileMap;
	}
	
	
	public static ChessTile createChessTile(final int tile_ID, final ChessPiece piece)
	{
		return piece != null ? new OccupiedChessTile(tile_ID, piece) : EMPTY_CHESS_TILES.get(tile_ID);
	}
	
	
	private ChessTile(int tile_ID)
	{
		this.tile_ID = tile_ID;
	}

	public abstract boolean isOccupied();
	
	public abstract ChessPiece/*will be implemented later*/ getPiece();
	
	public static final class EmptyChessTile extends ChessTile
	{
		private EmptyChessTile(final int emptyTile_ID)
		{
			super(emptyTile_ID);
		}
		
		@Override
		 public boolean isOccupied()
		 {
			 return false;
		 }
		
		@Override
		public ChessPiece getPiece()
		{
			return null;
		}

		
	}
	
	public static final class OccupiedChessTile extends ChessTile
	{
		private final ChessPiece PieceOnTile;
		
		private OccupiedChessTile(final int occupiedTile_ID, ChessPiece PieceOnTile)
		{
			super(occupiedTile_ID);
			this.PieceOnTile = PieceOnTile;
		}
		@Override
		public boolean isOccupied()
		{
			return true;
		}
		@Override
		public ChessPiece getPiece()
		{
			return this.PieceOnTile;
		}
		
	
	}
}


