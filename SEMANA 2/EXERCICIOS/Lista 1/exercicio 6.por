programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,d,y
		
		escreva ("Insira o numero A:")
		leia (a)
		
		         escreva ("\nInsira o numero B:")
		         leia (b)
		
		         escreva ("\nInsira o numero C:")
		         leia (c)

		         escreva ("\nInsira o numero D:")
		         leia (d)
	
		         y = ((mat.potencia((b + a),2)) + (mat.potencia((d + c),2)))

		         d = mat.raiz(y,2)

		         escreva ("\nO valor da equação é de: " + d)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */