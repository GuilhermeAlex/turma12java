package Aplicacao;

import java.util.Scanner;

import Entidades.Aves;
import Entidades.Cachorro;
import Entidades.Pessoa;

public class PetBet {

		
		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in); //leia objeto do tipo Scanner
			Pessoa cliente1 = new Pessoa("Gui", "lherme"); //instanciar - criar objeto do tipo pessoa
			Pessoa cliente2 = new Pessoa("Vivian");
				
			Cachorro dog1 = new Cachorro("Pintcher"); //criado um cachorro da raca pintcher
			Cachorro dog2 = new Cachorro("Pitbull");
			Aves ave1 = new Aves("Verde", "Curvado", "Arara");
			
			
			
			System.out.println(cliente1.nome);
			System.out.println(cliente1.sobrenome);
			System.out.println("Digite o sobrenome");
			cliente1.sobrenome = leia.nextLine();
			System.out.println("Digite o ano de nascimento:");
			cliente1.anoNascimento = leia.nextInt();
			System.out.println("Digite M/F/O:");
			cliente1.genero = leia.next().toUpperCase().charAt(0);
			System.out.println(cliente1.nome);
			System.out.println(cliente1.sobrenome);
			cliente1.idade(); // metodo idade()
			System.out.println(cliente1.pegaidade(2020));
			System.out.println("informando o ano");
			System.out.println(cliente1.seuGenero());
			
			
		}criar objeto de tipo pessoa
		
	}

}
