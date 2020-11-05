programa
{
	
	funcao inicio()
	{
				//objetivo: Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.

				//variaveis
				inteiro x
				inteiro contador = 0

			
				faca
			{	//entradas e processamento
				escreva ("Insira um número: ")
				leia (x)
					se (x >= 0 e x<= 25)// [0-25]
				{
						contador ++
				}
					se (x >= 26 e x <= 50) // [26-50]
				{
						contador ++	
				}
					se (x >= 51 e x <= 75)//[51-75]
				{
						contador ++
				}
					se (x >= 76 e x<= 100)//[76-100]
					{				
				contador ++
				}
				
			}		enquanto (x>0)

				escreva ("\nQuantidade dos numeros entre [0-25], [26-50], [51-75] e [76-100]: " + contador) // ele só vai porar quando for negativo
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 869; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */