package aulas;

		import java.util.Scanner;
public class Lista1Exec3 {
	public static void main (String[]args)
	{
	
	Scanner leia = new Scanner (System.in);
	int horas;
	int minutos;
	int segundos;
	int evento;
	
	System.out.println("Tempo do evento: ");
	evento = leia.nextInt();
	
	horas = evento/3600;
	minutos = (evento % 3600)/60;
	segundos = ((evento%3600)%60);
	
	System.out.println("Resultado em horas: "+minutos);
	System.out.println("Resultado em minutos: "+horas);
	System.out.println("Resultado em segundos: "+segundos);
	
	
	}
	

}
