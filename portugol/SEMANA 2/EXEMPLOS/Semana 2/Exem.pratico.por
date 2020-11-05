programa
{
	
	funcao inicio()
	{
		// Objetivo peça o nome do usuario, o ano de nascimento e caso 
		// a pessoa tenha mais de 18 informe adulto
		//caso tenha menos informe menor de 18 anos
          // se for 18 avise que tem 18 anos, que top!
	//variaveis
	cadeia nomeUsuario //ditas no objetivo
	inteiro anoNascimentoUsuario //ditas no objetivo
	inteiro idadeUsuario //vou usar porque eu quero
     const inteiro ANOATUAL = 2020
     caracter sexo
	//entradas
	escreva ("Digite seu nome:")
	leia(nomeUsuario)
	escreva ("Digite o ano de nascimento:")
	leia (anoNascimentoUsuario)
	escreva ("Vc é M=MASCULINO ou F+FEMININO:")
	leia(sexo)


	//PROCESSAMENTO
	idadeUsuario = ANOATUAL - anoNascimentoUsuario

	se(idadeUsuario < 18) {
		escreva("Oi Sr" +nomeUsuario+" vc é menor de 18 anos e sua idade é " + idadeUsuario)

		
		
	} 
	senao se (idadeUsuario == 18) {
		escreva("Oi Sr" +nomeUsuario+" vc tem 18 anos que top!")
		
	}
	senao se (idadeUsuario == 18) {
		se (sexo =='M' ou sexo=='m')
		escreva("OI SR "+nomeUsuario+" Vc tem 18 anos que top!")
		
	}
senao se (idadeUsuario ==18){
se (sexo=='F' ou sexo=='f') 

escreva("OI SRA "+nomeUsuario+" Vc tem 18 anos que massa!")	
}
	
	senao{ 
		escreva("Oi Sr " +nomeUsuario+" vc é adulto e sua idade é " + idadeUsuario)

	}
	escreva("\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */