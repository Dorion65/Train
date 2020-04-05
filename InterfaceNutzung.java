import java.util.Scanner;

public class InterfaceNutzung implements Rechnen {
	public static void main(String[] args) {
		int l;
		Scanner eingabewert = new Scanner(System.in);
		System.out.print("Geben sie 1 für Addition und 2 für Subtraktion ein: ");
	    l = eingabewert.nextInt();
	    
	    switch(l) {
	    
	    case(1):
	    {
	    	if(Rechnen.addition(4.52, 5.21) < 20)
	    		{
	    			System.out.println(Rechnen.addition(4.52, 5.21));;
	    		}
	    	break;
	    }
	    
	    case(2):
	    {
	    	if(Rechnen.subtraction(8, 4.12) > 12);
	    	System.out.println(Rechnen.subtraction(8, 4.12));
	    	break;
	    }
	    
	    default:
	    {
	    	System.out.println("Falsche Eingabe");
	    	break;
	    }
	   }
		
		
	}
}