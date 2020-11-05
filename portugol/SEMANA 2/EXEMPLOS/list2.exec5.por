programa

{
	
	funcao inicio()

		{
        real x, y, z
        escreva ("Insira o indice do grupo A: ")
        leia (x)
        escreva ("Insira o indice do grupo B: ")
        leia (y)
        escreva ("Insira o indice do grupo C: ")
        leia (z)
        limpa ()


        se ((x >= 0.05 e x <= 0.25)  e (y >= 0.05 e y <= 0.25) e (z >= 0.05 e z <= 0.25)){

            escreva ("Índice do grupo Autorizado!")
        }

         se (x >= 0.3){

                     senao se (x >= 0.5 e y >= 0.5 e z >= 0.5){

                         escreva ("TODOS GRUPOS VAO SUSPENDER ATIVIDADES!")
                     }
                     senao se (x >= 0.4 e y >= 0.4){
                         escreva ("ATENÇÃO!! GRUPO X E Y VAO SUSPENDER ATIVIDADES!")
                     }

                     senao se (x >= 0.5 e y >= 0.5 e z >= 0.5){
                         escreva ("índice abaixo do permitido")
                     }
                    senao { 
                    escreva ("ATENÇÃO!! GRUPO X DEVE SUSPENDER ATIVIDADES!")
                }
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1022; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */