package aulas;

import java.util.Scanner;

public class MeuNome {
	
	public static void main (String [] args) {
	
		
		//Criando o teclado ou Instanciando
		Scanner leia = new Scanner (System.in);
		
		
		int anoNascimento = 2001;
		int idade = 0;
		String nome = "Guilherme";
		double salario= 10345.55;		
		
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Digite o salario: ");
		salario = leia.nextDouble();
		
		idade = 2020 - anoNascimento;
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);
		/*
		// frase de saida
		
		System.out.printf("Meu nome é %s, e minha idade é %d e meu salario %f", nome, idade,salario);
		
		idade = 2020 - anoNascimento ;
		System.out.printf("\nSua idade é: " +idade);
		System.out.println();
		*/
	}
}
