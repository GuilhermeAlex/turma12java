package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;



public class CadAlunos1 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		//variaveis
		int matricula;
		String nome;
		Aluno aluno1 = new Aluno(matricula,nome);
		char genero;		
		//entradas
		System.out.println("Insira M- Masculino ou F- Feminino ou O- Outros");
		Aluno.genero = leia.next().toUpperCase().charAt(0);
		//processamento
		if (idade >0 && <13) 
		{
			System.out.println("Você é do ensino fundamental");
		}
		else if  (idade >13 && <17) 
		{
			System.out.println("Você é do ensino médio");
		}
		else (idade >17) 
		{
			System.out.println("Você é do ensino Superior");
		}

	}

}
