import java.util.Scanner;

public class vetorExemplo {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int [] arrayaUm = {12,3,5,68,9,6,73,44,456,65,321};
		int [] arrayaDois = {43,42,4,8,5,21,2,45};
		
		float[] nota= new float [5];
				
		//TAMANHO DO ARRAYA
		if (arrayaDois.length >8) 
		{
			System.out.println("Tamanho do arrayaDois - Maior que 8!");
		} else 
		{
			System.out.println("Tamanho do arrayaDois  - menor que 8!");
		}
		System.out.println("\nTamanho arrayaUm= "+arrayaDois.length);
	
		//UTILIZAÇÃO DO FOR EACH
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for (String i : cars) 
		{
			
		}
	
	
	
	}
	

}
