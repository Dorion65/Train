package ChessUtility;

public enum Alliance {
	white 
	{
		public int getDirection()
		{
			return -1;
		}
	},
	black
	{
		public int getDirection()
		{
		return 1;
		}
	};
	
	public abstract int getDirection();

}
