programa
{
	
	funcao inicio()
	{
		const inteiro LINHA = 1
		const inteiro COLUNA = 2
		inteiro n1[LINHA][COLUNA]
		inteiro n2[LINHA][COLUNA]
		inteiro m1[LINHA][COLUNA]
		inteiro m2[LINHA][COLUNA]
		inteiro x = 0, y=0
		
		//processsamento
		para (x= 0; x< LINHA; x++)
		{
			para (y= 0; y< COLUNA; y++) 
				{
				escreva("Insira o valor: ")
				leia(n1[x] [y])
				}	
		}
		para (x= 0; x< LINHA; x++)
		{
			para (y= 0; y< COLUNA; y++) 
			{
				escreva("Insira o valor: ")
				leia(n2[x] [y])
		
			}
		}
		para (x= 0; x< LINHA; x++)
		{
			para (y= 0; y< COLUNA; y++) {
				m1[x] [y] = n1[x] [y] + n2[x] [y]
				escreva(" ",m1[x] [y])
				
						}	
	
	
		} escreva("\n ")	
		para (x= 0; x< LINHA; x++)
		{
			para (y= 0; y< COLUNA; y++) {
				m2[x] [y] = n1[x] [y] - n2[x] [y]
				escreva(" ",m2[x] [y])


			}
}
}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */