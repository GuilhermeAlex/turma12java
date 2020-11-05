programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LINHA = 3
		const inteiro COLUNA = 3
		inteiro quadrinhoDe8[LINHA][COLUNA]
		inteiro somaDiagonal = 0
		
		inteiro x = 0, y=0
		para (x = 0; x<LINHA; x++)
		{
			para(y = 0; y<COLUNA; y++)
			{
				quadrinhoDe8[x][y] = Util.sorteia(1, 9)  //x = 2 = y= 2
				se (x==y)
				{
					somaDiagonal = somaDiagonal + quadrinhoDe8[x][y]	
				}
				
			}
		}
		para ( x = 0; x<LINHA; x++) // LINHA
		{
			para (y = 0; y<COLUNA; y++) //coluna
			{
				escreva(quadrinhoDe8[x][y])
				escreva(" ")
			}
			escreva("\n")
			
		}
		escreva("TOTAL DE VALORES DA DIAGONAL PRINCIPAL DA MATRIZ ", 	somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */