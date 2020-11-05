programa
{
	
	funcao inicio()
	{
		//variaveis
		 
		 real salario=0.0, mediaSalarios=0.0, maiorSalario=0.0, totalSalario=0.0,totalFilhos=0
		 inteiro filhos=0
		 real mediaFilhos=0.0
		 inteiro x=0;
		 inteiro quantidade = 0
		 inteiro menorcem = 0
		 inteiro contador

		 //entradas
		 escreva("Insira a quantidade dos entrevistados: ")
		 leia(QUANTIDADE)

		//processamentos
		 para (x =1 ; x <=quantidade; x++)
		 {
		 	escreva("Digite o salario do candidato: ")
		 	leia(salario)
		 	se (salario <100)
		 	{
		 		menorcem = menorcem+1	
		 	}
		 	totalSalario = totalSalario + salario
		 	escreva("Digite a quantidade de filhos:")
		 	leia(filhos)
		 	
		 	enquanto (filhos < 0){
		 		escreva("Filhos não pode ser com valor menor que zero: ")
		 		leia(filhos)
		 	}
		 	
		 	totalFilhos = totalFilhos+filhos
		 	se (maiorSalario < salario)
		 	{
		 		maiorSalario = salario
		 	}
		 	
		 }
		 
				 escreva("quantidade dos entrevistados: ", quantidade)
		 
		 		mediaSalarios=totalSalario / quantidade
		 
		 		mediaFilhos = totalFilhos / quantidade
		 
		 		escreva("\nMedia dos salarios: ", mediaSalarios)
		 
		 		escreva("\nTotal de filhos :", totalFilhos)
		 
		 		escreva("\nMedia de filhos :", mediaFilhos)
		 
		 		escreva("\nMaior Salario: ", maiorSalario)
		 
				 escreva("\nPessoas que recebe menos que 100: ", menorcem) 
		 
		 // transformação em percentual
		 
				 menorcem = (contador * 100)/3
		 		escreva("Percentual é de:" )
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 885; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */