package ChessBoard;

public class BoardUtility {
	
	public static boolean[] FIRST_COLUMN = initColumn(0);
	public static boolean[] SECOUND_COLUMN = initColumn(1);
	public static boolean[] SEVENTH_COLUMN = initColumn(6);
	public static boolean[] EIGTH_COLUMN = initColumn(7);
	
	public static final int NUM_Tiles = 64;
	public static final int NUM_TilesPerRow = 8;
	
	private static boolean[] initColumn(int columnNumber)
	{
		final boolean[] column = new boolean[64];
				
		do 
		{
			column[columnNumber] = true;
			columnNumber += NUM_TilesPerRow;
		}while(columnNumber < NUM_Tiles);
			return column;
	}

	private BoardUtility()
	{
		throw new RuntimeException("You cannot instantiate me.");
	}

	public static boolean isValidTileID(int tile_ID)
	{
		return tile_ID >=0 && tile_ID < NUM_Tiles;
	}

}
