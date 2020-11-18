package Entidades;

public class ContaPoupanca extends Contas  
{
	private int aniversarioConta;
	//UNIFICOU AS CLASSES CONTAS E CONTAPOUPANCA	
	public ContaPoupanca(String cpf, int numero, int aniversarioConta) {
		super(cpf, numero);//classe anterior
		this.aniversarioConta = aniversarioConta;
	}
	

}
