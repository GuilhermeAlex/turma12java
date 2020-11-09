package lista2Exec;
import java.util.*;
import java.math.*;


import java.util.*;

public class lista2Exec
{
	public static void main (String []args) 
	{
		Scanner leia= new Scanner (System.in);
		
		double base,altura,area;
		
		System.out.print("Digite o valor da base:");
		base = leia.nextDouble();
		System.out.print("Digite o valor da altura:");
		altura = leia.nextDouble();		
				
		if (base>0 && altura>0) 
		{
			area= ((base*altura)/2);
			
			System.out.printf("A area do triangulo é %.2f", area);
		}
		else 
		{
			System.out.println("Você não digitou o número valido");
		}
				
	}
}