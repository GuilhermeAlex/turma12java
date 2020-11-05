programa
{
{
	
	funcao inicio()
	{
				//variaveis
				inteiro numero[5]
				inteiro Manu = 0
				inteiro x=0

		

				//processamentos
				para(x=0 ; x<5; x++)
				{
				escreva("Insira um valor: ")
				leia(numero[x])
				}
				para(x=0; x<5; x++)
				{
				escreva ("\nValor posição ", x+1,":",numero[x])
				}
				para (x=0; x<5; x++) 
	  			{
	  			escreva("\nValor posição ", x+1,":",numero[x])
	  			se(numero[x] > Manu)
	  			}
	  			{
	  			Manu = numero[x]
	  			}

}				
	  			escreva ("\nA maior pontuação foi a: ", Manu)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */