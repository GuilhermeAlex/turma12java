package Aplicacoes;

import java.util.Scanner;

import Entidades.ContaPoupanca;

public class CadPoupanca 
{
		public static void main(String[] args) 
		{
			Scanner leia = new Scanner (System.in);
			//variveis e objetos
			char opcao;
			
		//ENTRADAS
		System.out.println("CLIENTE SEJA BEM VINDO AO JAVEIROS BANK!");
		System.out.println();
		System.out.println("Escolha a opção desejada:");
		System.out.println();
		System.out.println("1- Conta Poupança");
		System.out.println("2- Conta Corrente");
		System.out.println("3- Conta Especial");
		System.out.println("4- Conta Empresa");
		System.out.println("Digite a opção: ");
		opcao=leia.next().charAt(0);
		
		//PROCESSAMENTO
		if (opcao == '1') 
		{
			int data, numeroConta,diaHoje;
			double movimento; 
			char tipoMovimento;
			
			System.out.print("Digite o numero da Conta Poupança: ");
			numeroConta=leia.nextInt();
			System.out.print("Informe o dia do aniversario mensal da conta");
			data=leia.nextInt();
			ContaPoupanca cp1 = new ContaPoupanca(numeroConta,data);
			System.out.println();
			System.out.printf("Numero da conta","\n"+numeroConta);
			for (int x=1; x<=5; x++) 
			{
				System.out.println("Saldo Atual:"+cp1.getSaldo());
				System.out.println("Movimento");
				System.out.println("Debito ou Credito [D/C]");
				tipoMovimento = leia.next().toUpperCase().charAt(0);
				if (tipoMovimento=='D' && cp1.getSaldo()>0) 
				{
					
					
						System.out.print("Digite o valor do débito");
						movimento=leia.nextDouble();
					while (movimento> cp1.getSaldo()) 
					{
						System.out.println("Valor acima do saldo! Digite de novo:");
						movimento= leia.nextDouble();
					}
					cp1.debitar(movimento);
				}
				else if (tipoMovimento=='C') 
				{
					System.out.print("Digite o valor do crédito");
					movimento=leia.nextDouble();
					cp1.creditar(movimento);
				}
				else
				{
					System.out.println("A OPÇÃO INSERIDA É INVALIDA, FAÇA DE ACORDO COM O SOLICITADO!");
				}
			}
			System.out.println("Saldo atual: "+cp1.getSaldo());
			System.out.println("Digite o dia de hoje (APENAS O DIA)");
			diaHoje=leia.nextInt();
			if(diaHoje==data) 
			{
				double novosaldo = 0.0;
				novosaldo= cp1.getSaldo()*0.005;
				cp1.correcao(diaHoje);
				System.out.println("Seu Saldo após correção monetária: "+cp1.getSaldo());
			}
			System.out.println("OBRIGADO POR USAR O JAVEIROS BANK, VOLTE SEMPRE!!!");
		}
		else if (opcao == '2') 
		{
			
		}
		else if (opcao == '3') 
		{
			
		}
		else if (opcao == '4') 
		{
			
		}
		

		
		
		
		
		
		
		
		}//chave public static void
}//chave public class
