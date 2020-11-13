package listaRevisão;

import java.util.Scanner;

public class listaRevExec4 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		//variaveis
				double x= 1;
				double y = 1;
				double soma = 0.0, divisao=0.0;
				//processamento
				for (y=1; y<=50;y++)
				{
					divisao=x/y;
					soma = soma+divisao;
					x=x+2;
					
					System.out.printf("\nO resultado total é %.2f",soma);
				}
					

	}

}
