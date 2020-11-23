package Aplicacoes;

import java.util.Scanner;

import Entidades.ContaCorrente;

public class CadConta {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		ContaCorrente cc1 = new ContaCorrente(100);
		char opcao;
		double valor;
		
		
		System.out.println("Numero da conta:"+cc1.getNumero());
		System.out.println("Saldo da conta"+cc1.getSaldo());
		System.out.print("Vc deseja C-Creditar ou D-Debitar um valor?: ");
		opcao=leia.next().toUpperCase().charAt(0);
		
		if (opcao=='C') 
		{
			
			System.out.println("Qual o valor do credito:");
			valor=leia.nextDouble();
			cc1.creditar(valor);
		}
		else if (opcao=='D') 
		{
			if(cc1.getSaldo()<=0) 
			{
				System.out.println("CONTA SEM SALDO");
			}
			else
			{
				System.out.println("Qual o valor do debito:");
				valor=leia.nextDouble();
				cc1.debitar(valor);;	
			}
			
		}
		System.out.println();
		System.out.println("Numero da conta:"+cc1.getNumero());
		System.out.println("Saldo da conta: "+cc1.getSaldo());
	}

}
