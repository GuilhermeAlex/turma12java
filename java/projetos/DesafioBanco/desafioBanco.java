import java.util.Scanner;

public class desafioBanco {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		
		String numeroConta;
		String cpf;
		double Saldo[] = new double [10];
		int Saldoc = 100;
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
		System.out.println("12/11/2020 � o aniversario da conta deseja receber seu bonus monet�rio? 1-SIM/2-N�O ");
		codigo=leia.nextInt();
		if (codigo==1) 
		{
			Saldo[x]= 100 + (Saldo[x]*0.05);
			System.out.println("Voc� ganhou um bonus de 0,5% sobre seu Saldo");
			System.out.printf("Saldo R$: %.2f ",Saldo[x]);
			
			for (x=0; x<10; x++) 
			{
				System.out.println("\nDeseja 1-Creditar ou 2-Debitar?");
				codigo=leia.nextInt();
				if (codigo==1)  
				{
					System.out.println("\nQuanto deseja creditar?:");
					
					credito=leia.nextDouble();
					Saldo[x]=Saldo[x]+credito;
					
				}
				else if (codigo ==2)
				{
					System.out.println("\nQuanto deseja debitar?");
					debito=leia.nextDouble();
					Saldo[x]=100-debito;
					
				}
				else 
				{
					System.out.println("codigo digitado invalido!!");
				}
				System.out.printf("Seu saldo �: %.2f", Saldo[x]);
	
			
			} System.out.println("\nVOC� ATINGIU O LIMETE DE 10 MOVIMENTA��ES!");
		}
		
		System.out.print("\n-------------------------------\n");
		System.out.print("Conta: "+numeroConta+"\t"+"cpf: "+cpf);
		
		System.out.print("\n-------------------------------\n");
		
		for(x=0;x<10;x++) 
		{
			System.out.printf("\nR$ %.2f",Saldo[x],"\n");
		
		}

}
}
