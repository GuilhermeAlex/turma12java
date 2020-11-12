import java.util.Scanner;

public class ecommerce {

	public static void main(String[] args) 
	{//chave public static
		
		Scanner leia = new Scanner (System.in);
		
		final int minimo = 10;
		int x = 0, y = 0;
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		
		//CODIGOS E VALOR DOS PRODUTOS
		double valor[] = {40.00, 30.00, 20.00, 30.00, 30.00, 25.00, 20.00, 20.00, 10.00, 10.00};
		
		int codigo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int vezes = 0;
		double valorCompras[] = new double[minimo];
		double valorTotal = 0.0;
		double imp = 0.0;
		double valorAtualizado = 0.0;
		
		//PRODUTOS DA NOSSA LOJA
		String produtos[] = {"Calça","Short","Camisa","Vestido","Camiseta","Babylook","Saia","Bermuda","Touca","Cinto"};
		
		//CARACTER COM INTERACAO DO USUARIO
		String compras[] = new String [minimo];
		char dinheiro, cheque, credito, parcelas, juros, notaFiscal, empresa, imposto, totalPagar, confirmacao, novoUser;PRODUTOS,VALOR,ESTOQUE,carrinho;
		String pag, parc;
		boolean user = true;

		// CODIGO DOS PRODUTOS
		
		System.out.println("PRODUTOS:\t","VALOR:\t\t","ESTOQUE:\n");
		for (x = 0; x<10; x++) 
		{// chave do para
		System.out.println("------------------------------------------------\n");
		System.out.println("codigo[x]," - ",produtos[x],"\tR$",valor[x],"\t\t",estoque[x]," und.\t|","\n");
		}
		System.out.println("\nPor favor, digite o código do produto que deseja: ");
		
		for (x = 0; x<10; x++) 
		{//chave para
			leia.next(codigo[x]);
		}
		if(codigo[x] == 1)
		{ //chave se
			estoque[x] = estoque[x] -1
			compras[x] = produtos[0]
			valorCompras[x] = valor[0]
			System.out.println("O produto ","'",produtos[0],"'", " foi adicionado ao carrinho.\n")
			System.out.println("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia.next(confirmacao);
			if (confirmacao == 'S' || confirmacao == 's')
			{
				System.out.println("\nPor favor, digite o código do produto que deseja: ");
			}//chave se 
			else 
			{//chave senão
				break 
			}//chave senão
		}// chave se
		if (codigo[x] == 3)
		{ //chave se
			estoque[x]= estoque[x] -1
			compras[x] = produtos[2]
			valorCompras[x] = valor[2]
			System.out.println("O produto ","'",produtos[2],"'", " foi adicionado ao carrinho.\n");
			System.out.println("\nDeseja adicionar outros produtos ao carrinho ?(S/N)");
			leia.next(confirmacao);
			if (confirmacao == 'S' || confirmacao == 's')
			{//chave se
				System.out.println("\nPor favor, digite o código do produto que deseja: ");
			}//chave se
			else 
			{
			break	
			}//chave pare
		
		}//chave se
		if (codigo[x] == 4)
		{ // chave se
			estoque[x] = estoque[x] -1
			compras[x] = produtos[3]
			valorCompras[x] = valor[3]
			System.out.println("O produto ","'",produtos[3],"'", " foi adicionado ao carrinho.\n");
			System.out.println("\nDeseja adicionar outros produtos ao carrinho ?(S/N)");
			leia.next(confirmacao);
			if (confirmacao == 'S' || confirmacao == 's')
			{//chave se
				System.out.println("\nPor favor, digite o código do produto que deseja: ");
			}//chave se
		}//chave se
			else 
			{
				break 
			}
			if(codigo[x] == 5)
			{// chave se
				estoque[x] = estoque[x] -1
				compras[x]= produtos[4]
				valorCompras[x] = valor[4]
				System.out.println("O produto ","'",produtos[4],"'", " foi adicionado ao carrinho.\n");
				System.out.println("\nDeseja adicionar outros produtos ao carrinho ?(S/N)");
				leia.next(confirmacao);
			}// chave se
			if (confirmacao == 'S' || confirmacao == 's')
			{//chave se
				escreva("\nPor favor, digite o código do produto que deseja: ");
			}//chave se
			else 
			{//chave senao
				break
			}//chave se nao
	
	
	}//chave se
}// chave public static
}//chave inicial
