
public class Datentypen {

	public static void main(String[] args) {
		boolean jain = true;
		if(jain == true)
		{
			char a = 'A';
			char b = '1';
			String BOOL = "True";
			System.out.println(BOOL + a + b);
			jain = false;
		}
		
		if(jain == false)
		{
			int i = 22;
			long l = i;
			int ii = (int) l; //casting long -> int
			System.out.println("False" + ii);
			jain = true;
		}

	}

}
