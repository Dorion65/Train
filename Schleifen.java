
public class Schleifen {
	public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("FOR");
            while(i%2==0)
            {
                System.out.println("WHILE");
                i++;
                do {
                    System.out.println("DO");
                    i++;
                }while (i % 3 == 0) ;
                }

            }
        }
    }

