programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro limite=10
		inteiro lancamentos[limite]
		inteiro x=0
		inteiro Totalsoma=0
		inteiro somalan=0
		inteiro Maiorvalor=0
		inteiro contadorMaior=0
		
		para (x=0; x<limite; x++)
		{
			lancamentos[x]=Util.sorteia(1,6)
			escreva("\nValor da posição",x+1,":",lancamentos[x])
			somalan=somalan+lancamentos[x]
			se (lancamentos[x] >=Maiorvalor)
			{
				se (lancamentos[x] != Maiorvalor)
				{
					contadorMaior=0
				}
				Maiorvalor=lancamentos[x]
				contadorMaior++
			}
				
		}
		escreva("\nTotal de valores somados: ", somalan)
		escreva("\nMedia aritmetica: ", (somalan/limite))
		escreva("\nMaior valor ", Maiorvalor)
		escreva("\nQuantas vezes aparece: ",contadorMaior)
	}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 759; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */