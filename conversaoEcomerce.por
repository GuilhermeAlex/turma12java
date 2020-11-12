programa
{
	
	funcao inicio()
	{
		escreva("\nPRODUTOS:\t","VALOR:\t\t", "ESTOQUE:\n")
		para(x = 0; x<10; x++){
			escreva("------------------------------------------------\n")
			escreva(codigo[x]," - ",produtos[x],"\tR$",valor[x],"\t\t",estoque[x]," und.\t|","\n")
				
		} //CONVERTIDO
		escreva("\nPor favor, digite o código do produto que deseja: ");
		para(x = 0; x<10; x++) {
			leia(codigo[x]); //CONVERTIDO
		
				se(codigo[x] == 1){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[0]
					valorCompras[x] = valor[0]
					escreva("O produto ","'",produtos[0],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);//CONVERTIDO
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: "); //CONVERTIDO	
					} senao {
						pare
					}
				}
				se(codigo[x] == 2){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[1]
					valorCompras[x] = valor[1]
					escreva("O produto ","'",produtos[1],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}//CODIFICADO
				se(codigo[x] == 3){
					estoque[x]= estoque[x] -1
					compras[x] = produtos[2]
					valorCompras[x] = valor[2]
					escreva("O produto ","'",produtos[2],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");//CODIFICADO
					}senao {
						pare
					}
				}// CODIFICADO
				se(codigo[x] == 4){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[3]
					valorCompras[x] = valor[3]
					escreva("O produto ","'",produtos[3],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);// CODIFICADO
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}// CODIFICADO
				se(codigo[x] == 5){
					estoque[x] = estoque[x] -1
					compras[x]= produtos[4]
					valorCompras[x] = valor[4]
					escreva("O produto ","'",produtos[4],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao); //CODIFICADO
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}//CODIFICADO
				se(codigo[x] == 6){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[5]
					valorCompras[x] = valor[5]
					escreva("O produto ","'",produtos[5],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 7){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[6]
					valorCompras[x] = valor[6]
					escreva("O produto ","'",produtos[6],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 8){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[7]
					valorCompras[x] = valor[7]
					escreva("O produto ","'",produtos[7],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
				se(codigo[x] == 9){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[8]
					valorCompras[x] = valor[8]
					escreva("O produto ","'",produtos[8],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
					
				}
				se(codigo[x] == 10){
					estoque[x] = estoque[x] -1
					compras[x] = produtos[9]
					valorCompras[x] = valor[9]
					escreva("O produto ","'",produtos[9],"'", " foi adicionado ao carrinho.\n")
					escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
					leia(confirmacao);
					se (confirmacao == 'S' ou confirmacao == 's'){
						escreva("\nPor favor, digite o código do produto que deseja: ");
					}senao {
						pare
					}
				}
			}
			limpa();
			escreva("Carrinho de compras:\n")
			escreva("PRODUTOS:\t","VALOR:\n")
			para(x = 0; x < minimo; x++ ){
				valorTotal = valorTotal + valorCompras[x]
				escreva("------------------------------------------------\n")
				escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")
			
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2802; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */