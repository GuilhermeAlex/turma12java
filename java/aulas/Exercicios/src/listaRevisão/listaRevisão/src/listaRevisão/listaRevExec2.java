package listaRevisão;

import java.util.Scanner;

public class listaRevExec2 {

	public static void main (String [] args)
	{
		Scanner leia = new Scanner (System.in);
		//variaveis
		double peso;
		double altura;
		double imc;
		//entradas
        System.out.println ("Digite o seu peso: ");
        peso = leia.nextDouble();
        System.out.println ("Digite a sua altura: ");
        altura = leia.nextDouble();

        imc =(peso/(Math.pow(altura,2)));

        if (imc <= 18.5)
        {
            System.out.println ("\nAlerta seu peso está abaixo do normal");
        }
        else if (imc >= 18.6 && imc < 25)
        {
            System.out.println ("\nPeso normal ");
        }
        else if (imc >= 25 && imc <= 30)
        {
            System.out.println ("\nVocê está acima do peso");
        }
        else if (imc >30)
        {
            System.out.println ("\n Alerta você está obeso");
        }
		
				
	}
}


