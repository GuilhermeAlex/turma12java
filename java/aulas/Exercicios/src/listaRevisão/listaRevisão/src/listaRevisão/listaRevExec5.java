package listaRevisão;

import java.util.Scanner;

public class listaRevExec5 {
	 public static void main(String[] args) 
	    {

	        Scanner leia = new Scanner (System.in);
	        
	        //variaveis
	        int vetor [] = new int [5];
	        int x;
	        int y;
	        //processamento
	        for (y = 0; y < 5; y++)
	        {
	            System.out.println("Insira o número de posição do vetor "+(y+1)+" do vetor: ");
	            vetor [y] = leia.nextInt();
	        }

	        System.out.println("\nInsira o código 1 ou 2: "); //1 sehue a ordem normal e 2 segue a ordem inversa 
	        x = leia.nextInt();

	         if (x==1)
	        {
	            for (y=0; y <5; y++)//ordem normal
	            {
	                System.out.println ("\nPosição: " + (y+1)  + " Valor: "+vetor[y]);

	            }
	        }
	        else if (x==2)//ordem inversa
	        {
	            for (y=4; y >=0; y--)
	            {
	                System.out.println ("\nPosição: " + (y+1)  + " Valor: "+vetor[y]);

	            }
	        }
	        else 
	        {
	            System.out.println("\n\nPrograma Encerrado TCHAU OBRIGADO!");
	        }

}
}
