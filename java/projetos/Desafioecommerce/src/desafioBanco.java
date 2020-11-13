import java.util.Scanner;

public class desafioBanco {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		
		String numeroConta;
		String cpf;
		double Saldo = 100;
		int dataAniversario;
		double credito = 0;
		double debito;
		int codigo;
		int x =0 ;
		int codigoX;
	
		
		
		//entradas
		System.out.println("Digite o numero da conta:");
		numeroConta= leia.nextLine();
		System.out.println("Digite seu CPF:");
		cpf=leia.nextLine();
		
		//processamento
		System.out.println("12/11/2020 É o aniversario da conta deseja receber seu bonus monetário? 1-SIM/2-NÂO ");
		codigo=leia.nextInt();
		if (codigo==1) 
		{
			Saldo= Saldo + (Saldo*0.05);
			System.out.println("Você ganhou um bonus de 0,5% sobre seu Saldo");
			System.out.printf("Saldo R$: %.2f ",Saldo);
			
			for (x=0; x<10; x++) 
			{
				System.out.println("\nDeseja 1-Creditar ou 2-Debitar?");
				codigo=leia.nextInt();
				if (codigo==1)  
				{
					System.out.println("\nQuanto deseja creditar?:");
					
					credito=leia.nextDouble();
					Saldo=Saldo+credito;
					
				}
				else if (codigo ==2)
				{
					System.out.println("\nQuanto deseja debitar?");
					debito=leia.nextDouble();
					Saldo=Saldo-debito;
					
				}
				else 
				{
					System.out.println("codigo digitado invalido!!");
				}
				System.out.printf("Seu saldo é: %.2f", Saldo);
	
			
			} System.out.println("\nVOCÊ ATINGIU O LIMETE DE 10 MOVIMENTAÇÕES!");
		}
		
		
		
	}

}
