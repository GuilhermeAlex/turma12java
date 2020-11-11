import java.util.Scanner;

public class Lista3Exec1enquanto 
{
	public static void main (String[] args)
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 	*/
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int valor = 0; 
		int resSoma = 0; 
		int n=0;
		int media= 0;
		
		//variaveis
		while (valor >= 0 )
		{
					n= (n+1);
					resSoma=(resSoma + valor);
					media=(resSoma/n);
					System.out.printf("Digite um valor numerico positivo:");
					valor=leia.nextInt();
					
		}
		System.out.print("\nO programa resultou "+n);
		System.out.print("\nSoma total de vezes é:"+resSoma);
		System.out.print ("\nA média é de:"+media);

	}

}
