package aulas;
		import java.util.Scanner;
public class List1Exec1 {
	public static void main (String[]args)
{
		Scanner leia= new Scanner (System.in);
		
		
		int anos;
		int meses;
		int dias;
		
		System.out.println("Digite sua idade em anos:");
		anos = leia.nextInt();
		
		
		System.out.println("Digite quantos meses:");
		meses=leia.nextInt();
		
		System.out.println("Digite quantos dias:");
		dias=leia.nextInt();
		
		//processamento
		anos = anos*365;
		meses = meses*30;
		dias = anos + meses + dias;
		
		System.out.println("O resultado da sua idade em dias é:"+dias);
}


}
