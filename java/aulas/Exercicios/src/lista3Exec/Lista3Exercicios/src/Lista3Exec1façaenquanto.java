import java.util.Scanner;

public class Lista3Exec1façaenquanto {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
				//variaveis
				int x=233;
		
				//processamento
				do 
		{
			
				System.out.println(x);
				
				
				if( x>=233 && x<=456) 
				{
					x=x+3;
				}
				else 
				{
					x= x + 5;
				}
			
		
		}while (x<=456);

		
		
	}

}
