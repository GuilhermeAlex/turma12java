package lista2Exec;

import java.util.Scanner;

public class Lista2Exec6 {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		
		int idade = 0;
		
		
		//entradas 
		
		System.out.println("Digite a idade do nadador:");
		idade=leia.nextInt();
		//processamentos
		if (idade<5) //SE
		{
			System.out.println("Nao podemos atender nessa idade");
		}
		
		//SENAO SE
		else if (idade>=5 && idade <=7)
		{
			System.out.println("Infantil A");
		}
		
		else if (idade>=8 && idade <=11)
		{
			System.out.println("Infantil B");
		}
		else if (idade>=12 && idade <=13)
		{
			System.out.println("Juvenil A");
		}
		else if (idade>=14 && idade <=17)
		{
			System.out.println("Juvenil B");
		}
		else if (idade>=18)
		{
			System.out.println("Adulto");
		}
		
		
		
		
	}

}
