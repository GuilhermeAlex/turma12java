package lista2Exec;

import java.util.Scanner;

public class Lista2Exec2 {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		
		//variaveis
		
		String C;
		int n,limite = 50;
		double salario, salarioNormal, salarioExcedente,salarioTotal = 0;
		double valorHora = 10.00, valorExcedente = 20.00;
		int e = 0;
		
		
		//entradas
		System.out.println("Qual o código do funcionário:");
		C= leia.next();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		n= leia.nextInt();
		
		if(n <= 50)
		{
			salarioNormal= n * valorHora;
			
			System.out.println("salarioNormal: "+salarioNormal);
		}
		
		else if (n > 50) 
		{
			salarioExcedente = ((n-limite) * 20);
			salarioNormal = (limite * valorHora);
			salarioTotal= salarioNormal + salarioExcedente;
			
			System.out.println("Salario normal: "+salarioNormal);
			System.out.println("Salario Excedente:"+salarioExcedente);
			System.out.println("Salario Total: "+salarioTotal);
			
		}
		
	
	
	}

}
