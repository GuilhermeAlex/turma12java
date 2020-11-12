package lista4Exercicios;

import java.util.Scanner;

public class lista4Exec1 {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		int vetor [] = new int [5];//declarando 
		int Manu = 0;
		int x = 0;
		
		
		//processamento
		for (x=0; x<5;x++) 
		{
			System.out.println("\nValor posição:");
			vetor[x] = leia.nextInt();
		}
		
		for (x=0; x<5;x++) 
		{
			System.out.print("\nvalor posição "+ (x+1)+" : "+vetor[x]);
			if (vetor[x]>Manu) 
			{
				Manu = vetor[x];
			}
		}
		System.out.println("\nMaior valor="+Manu);
	}

}
