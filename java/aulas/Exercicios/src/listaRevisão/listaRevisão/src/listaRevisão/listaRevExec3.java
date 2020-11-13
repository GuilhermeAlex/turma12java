package listaRevisão;

import java.util.Scanner;

public class listaRevExec3 {
	public static void main (String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		//variaveis
		int x= 0;
		int y = 0;
		
		//processamneto
		do
		{
			System.out.println("Insira um numero:");
			x = leia.nextInt();
			
				if (x>= 0 && x<25)
				{
					y++;
				}
			
				else if (x>=26 && x<= 50)
				{
					y++;
				}
				else if (x>=51 && x<75)
				{
					y++;
				}
				else if (x>=76 && x<100)
				{
					y++;
				}
			
		} while (x>0);
		
		System.out.println("\n Quantidade de numero nos padrões [0-25], [25-50],[51-75],[76-100]: "+y);

}
}
