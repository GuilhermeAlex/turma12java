programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		// Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
		//IMC em adultos Condição
		//Abaixo de 18,5 Abaixo do peso
		//Entre 18,5 e 25 Peso normal
		//Entre 25 e 30 Acima do peso	
		//Acima de 30 obeso

		//variaveis
		real altura, imc, peso
		//entradas
		escreva ("Digite o seu peso: ")
		leia (peso)
		escreva ("Digite a sua altura: ")
		leia (altura)
		//processamento
		imc = mat.arredondar(peso/(altura*altura), 2)//dica da conta ED
		
		se (imc <= 18.5)
		{
			escreva ("\nSeu peso está abaixo :")
		}
		se (imc >= 18.6 e imc <= 25)
		{
			escreva ("\nSeu peso está normal")
		}
		se (imc >= 25 e imc <= 30)
		{
			escreva ("\n Está acima do peso :")
		}
		se (imc >30)
		{
			escreva ("\n Você está obeso :")	
		}	
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */