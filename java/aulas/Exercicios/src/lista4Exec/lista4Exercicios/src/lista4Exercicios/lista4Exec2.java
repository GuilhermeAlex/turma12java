package lista4Exercicios;

import java.util.Scanner;

public class lista4Exec2 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int vetor [] = new int [10];//montando vetor
		int resultado = 0 ;
		int x= 0 ;
		int y= 0;
		int maiorv= 0;
		int manu = 0;//manu=maior numero
		int media = 0 ;
		
		//entradas
		System.out.printf("Valor da jogada sendo de 1 a 6:");
		vetor [x]= leia.nextInt();
	
		//processamento
		for (x=0 ; x <10; x++);
		{
			resultado=resultado = vetor[x];
			media = resultado / 10; //calculo média 
		}
		if (vetor[x]>=maiorv)
		{
			maiorv= 0;
			maiorv = manu+vetor[x];
			manu ++;
		}

		
	
				System.out.println("Resultado das somas dos valores:"+resultado);
				System.out.println("Maior numero:"+maiorv);
				System.out.println("Média dos valores:"+media);
				System.out.println("Quantidade de vezes do maior numero:"+manu);
				
	
	}
	

}
