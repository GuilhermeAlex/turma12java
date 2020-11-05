programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,r,s,d
		
		escreva ("Insira o numero A:")
		leia (a)
		
		escreva ("\n Insira o numero B:")
		leia (b)
		
		escreva ("\nInsira o numero C:")
		leia (c)
	
		r = (mat.potencia((a + b),2))
		s = (mat.potencia((b + c),2))

		d = (r + s) /2

		escreva ("\n A expressão D é :" + d)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */