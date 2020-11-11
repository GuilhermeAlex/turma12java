import java.util.Scanner;

public class lista3exec2para 
{
		public static void main (String[] args)
		{
			Scanner leia = new Scanner (System.in);
			
			
			//variaveis 
			int contador = 0, soma = 0;
			
			//processamento
			
			for (contador = 0; contador <=500; contador++)
			{
				if ((contador % 2) !=0 && (contador %3) ==0) 
				{
					soma = contador + soma;
					
					System.out.println("\n O resultado dos números ímpares múltiplo de 3:" +soma );
				}
					
			
			}
			
			
		}

}
