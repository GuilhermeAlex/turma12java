programa
{
	
	funcao inicio()
	{
		
		//Objetivo:  
		//Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
		//Código Condição de pagamento
		//1 À vista em dinheiro ou cheque, recebe 20% de desconto
		//2 À vista no cartão de crédito, recebe 15% de desconto
		//3 Em duas vezes, preço normal de etiqueta sem juros
		//4 Em três vezes, preço normal de etiqueta mais juros de 10%


					//variaveis
					cadeia pag, ccred
					real valor, desconto
		 
				//entradas
				escreva ("Digite o valor do produto selecionado: ")
				leia (valor)
				escreva ("\nMeio de pagamento")
				escreva ("\nDigite 'AV' para a vista, 'AC' para a vista no cartão de crédito ou 'CCRED' para cartão de crédito: ")
				leia (pag) 
				
				
				
				//processamento
		
		
		
			se (pag == "ccred" ou pag == "CCRED")
		{
			 
			 escreva ("Quantidade de parcelas: 2 ou 3 vezes: ")
			 leia (ccred)
			 se (ccred == "2" ou ccred== "3")// parcelamento em 2 vezes não tem porcentagem de juros
			 {
			 	desconto = valor *0.10//porcento de juros acrescentado caso parcelamento em 3 vezes
			 	valor = valor + desconto
			 	escreva ("\nO total a pagar é:  " + valor + " parcelamento feito em 3x.")
			 }
			 senao
			 {
			 	valor = valor + 0
			 	escreva ("\nO valor a ser pago é:  " + valor)
			 }
		}	 
		se (pag == "av" ou pag == "AV")
		{
			desconto = valor *0.20 //porcento de desconto não esquece
			 valor = valor - desconto
			 
			 escreva ("\nO total a pagar é:  " + valor)
		}
		
		se (pag == "ac" ou  pag == "AC")
		{
			desconto = valor * 0.15//porcento de desconto não esquece
			valor = valor - desconto
			escreva ("\nO valor a ser pago é:  " + valor)
		}
			 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1777; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */