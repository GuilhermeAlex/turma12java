import java.util.Scanner;

public class testeTriangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//Calcular area do triangulo= area*altura/2
		
		//variaveis
		int areaT1 = 0, areaT2 = 0;
		int altura = 0, base = 0;
		//entradas
		System.out.print("Altura do primeiro triângulo: ");
		altura = leia.nextInt();
		System.out.print("Base do primeiro triângulo: ");
		base = leia.nextInt();
		areaT1 = base * altura / 2;
		System.out.println("ÁREA DO TRIÂNGULO T1: " + areaT1);
		
		System.out.print("\nAltura do segundo triângulo: ");
		altura = leia.nextInt();
		System.out.print("Base do primeiro triângulo: ");
		base = leia.nextInt();
		areaT2 = base * altura / 2;
		System.out.println("ÁREA DO SEGUNDO TRIÂNGULO T2: " + areaT2);
		//processamento
		if (areaT1 > areaT2)
			System.out.println("O primeiro triângulo é o maior.");
		else if (areaT1 < areaT2)
			System.out.println("O segundo triângulo é o maior.");
		else if (areaT1 == areaT2)
			System.out.println("Triângulos com a mesma quantidade na superficie.");


	}

}
