package lista2Exec;

import java.util.Scanner;

public class Lista2Exec1 {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
	
		double P = 0;
		double M = 0;
		double E = 0;
		
				System.out.println("\nQual é o peso:");
				P = leia.nextDouble();
		
				
		if(P>50.0) 
		{
				E=(double) (P*4.00);
				M=(Math.round((E -200.0)));
			
				System.out.println("\nDevido ao excesso de peso o valor será:" +M);

		}
		
		else  
		{
						
			System.out.println("\nP:  " +P+"\n E:   " +E+" \n M:  " +M);
		}

		

	}

}
