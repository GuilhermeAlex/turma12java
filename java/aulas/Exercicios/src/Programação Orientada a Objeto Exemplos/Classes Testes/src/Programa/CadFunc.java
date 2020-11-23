package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Funcionario;
import Classes.Terceiro;

public class CadFunc {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int numero;
		//Interface
		List<Funcionario> cadastro = new ArrayList<>();//INTERFACE
		
		
		System.out.println("Digite o numero de funcionarios para cadastro: ");
		numero = leia.nextInt();
		
		for (int x=1; x<=numero; x++) 
		{
			System.out.println("Empregado "+x);
			System.out.println("Terceiro S/N: ");
			char resposta = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o o cofigo do func: ");
			String codigo = leia.next();
			System.out.println("Digite as horas: ");
			double horas = leia.nextDouble();
			System.out.println("Digite o valor hora: ");
			double valorHora = leia.nextDouble();
			
			if (resposta== 'S') 
			{
				System.out.println("Digite o valor adicional deste terceiro: ");
				double adicional = leia.nextDouble();
				cadastro.add(new Terceiro (codigo,horas,valorHora,adicional));//EXENPLO DE POLIMORFISMO
				
				Funcionario func1 = new Funcionario ();
			}
			else 
			{
				cadastro.add(new Funcionario(codigo,horas,valorHora));
			}
			System.out.println();
			System.out.println("Folha de Pagamento");
			for (Funcionario func1: cadastro) 
			{
			System.out.println(func1.getCod() + "---"+String.format(""%.2f", func1));	
			}
		}
	}

}
