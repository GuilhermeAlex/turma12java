programa
{
	
	funcao inicio()
	{
		// Sistema que da a idade do nadador
		//Infantil A= 5 a 7 anos
		// Infantil b= 8 a 11 anos
		// Juvenil A= 12 a 13 anos
		// Juvenil B= 14 a 17 anos
		// Adultos = Maiores de 18 anos

		 //variaveis
		 inteiro idade

		 //entradas 
		 escreva("Digite a idade do nadador(a):")
           leia(idade)
           se (idade < 5) {
           	escreva("Nao podemos atender nessa idade")
           }
           senao se (idade>=5 e idade <=7) {
           		escreva("Infantil A")
           	
           }
	senao se (idade>=8 e idade <=11) {
           		escreva("Infantil B")}
	
	senao se (idade>=12 e idade <=13) {
           		escreva("Juvenil A")}
	senao se (idade>=14 e idade <=17) {
           		escreva("Juvenil B")}
	senao se (idade>=18) {
           		escreva("Adulto")}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */