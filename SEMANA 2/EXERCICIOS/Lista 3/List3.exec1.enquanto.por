programa
{
	
	funcao inicio()
	{
		inteiro valor,resSoma,n
        	real media

        valor=0
        n=0
        resSoma=0
        media=0

        enquanto(valor >= 0)
        {
            n=n+1
            resSoma=resSoma + valor
            media=resSoma/n
            escreva("Digite um valor numérico: ")
            leia(valor)
        }
        escreva("O sistema resultou ",n," multiplicado, a soma total é de ",resSoma," e a média é de ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 119; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */