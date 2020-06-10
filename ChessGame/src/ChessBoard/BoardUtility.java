package ChessBoard;

public class BoardUtility {
	
	public static boolean[] FIRST_COLUMM;

	private BoardUtility()
	{
		throw new RuntimeException("You cannot instantiate me.");
	}

	public static boolean isValidTileID(int tile_ID)
	{
		return tile_ID >=0 && tile_ID <64;
	}

}
