programa
{
	inclua biblioteca Matematica --> mat // apelido biblioteca
	
	funcao inicio()
	{
		// OBJETIVO: Escreva a distância entre eles. A fórmula que efetua tal cálculo é:
		// A fórmula está no docs de exercicios
		
           real  x1,x2,y1,y2,d=0.0 // variável d é o resultado

           // entradas
           escreva("digite o valor de x1:")
           leia(x1)
           escreva("digite o valor de x2:")
           leia(x2)
           escreva("digite o valor de y1:")
           leia(y1)
           escreva("digite o valor de y2:")
           leia(y2)

           //processamento
        // função pra orientar
        //  
     d= mat.raiz (mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2),2)

     

      d= mat.raiz((mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2)),2)

      //saida
      escreva ("A distancia calculada p1 e p2 é",d)
      
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 866; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */