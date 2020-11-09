package aulas;
				import java.util.Scanner;
public class Lista1Exec2 {
			public static void main (String[]args)
			{
				Scanner leia = new Scanner (System.in);
				
		int dias = 0;
		int meses = 0;
		int anos = 0;
		
		System.out.print("Insira a sua idade em dias: ");
		
		dias=leia.nextInt();
		
		anos=(dias/365);		
				
		meses=(dias%365)/30;
		
		dias= ((dias % 365)%30);
		
		
		System.out.println("Resultado da idade em anos: "+anos);		
		System.out.println("Resultado da idade em meses: "+meses);	
		System.out.println("Resultado da idade em dias: " +dias);	
			}
	
	
	
}