programa
{
	
	funcao inicio()
	{
		//objetivo pedir ao usuario o tamanho da linha e imprimir na tela essa linha

		// variaveis
		inteiro tamanho

		//entradas
		escreva("Digite o tamnho da linha entre 1 e 80:")
		leia (tamanho) //limite

		
		
		//processamento
		enquanto (tamanho < 0)
		{
			escreva ("\nAMIGUINHO, É SÓ ATÉ 80, DIGITE DE NOVO:")
			escreva("\nDigite o tamnho da linha entre 1 e 80:")
			leia (tamanho)
		}
		
		enquanto (tamanho >80) 
		{
			escreva ("\nAMIGUINHO, É SÓ ATÉ 80, DIGITE DE NOVO:")
			escreva("\nDigite o tamnho da linha entre 1 e 80:")
			leia (tamanho) //
		}
		para (inteiro x=1; x<= tamanho; x++)
		{
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */