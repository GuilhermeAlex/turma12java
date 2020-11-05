programa
{
	inclua biblioteca Matematica -->  mat
	
	funcao inicio()
	{
		// Objetivo sistema pros tomates do joao

	    //variaveis
	    real p, ex, m
	    escreva ("Insira o peso aqui:")
	    leia(p)
	    limpa()
	    //processamento
	    se (p>50.0){
	   
	    			ex = p * 4.00
	    			m  = mat.arredondar (( ex * 200.0),2)
	    			escreva ("Multado devido excesso de peso!:" + m)
	    	
	    }
	    senao {
         				p= 0
         				ex= 0
         				m= 0
         	
         	
         	escreva ("P : " +p+ ", E:, "+ex+", M: "+m)
         	
	    	
	    }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */