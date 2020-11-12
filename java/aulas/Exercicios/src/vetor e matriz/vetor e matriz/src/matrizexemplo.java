import java.util.Scanner;

public class matrizexemplo {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		//OBJETIVO UMA MATRIZ PARA TAREFAS DO DIA
		
		//variaveis
		
		
		int x=0;
		int dia = 0;
		String diaSemana [] [] = new String [5][31];
		int tarefas = 0;
	
		//ENTRADA
		System.out.println("Insira suas tarefas do dia:");
		//PROCESSAMENTO
		for (x=0; x<5; x++)
		{
			System.out.println(diaSemana[x]);
			
			diaSemana[x][dia-1]=leia.next();
		}
		
	
	}

}
