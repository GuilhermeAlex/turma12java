programa
{
	
	funcao inicio()
	{
	//variaveis
	inteiro numero[4],x

	//processamento
	para (x=0; x<4; x++)
	{
		escreva("Entre com um numero: ")
		leia(numero[x])
	}
	

	  	para (x=0; x<4; x++)
	  	{
	  	escreva("\nValor posição ", x+1,":",numero[x])
	  	}
	  	para (x=4; x>0; x--) 
	  	{
		escreva("\nValor posição ", x+1,":",numero[x])
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */