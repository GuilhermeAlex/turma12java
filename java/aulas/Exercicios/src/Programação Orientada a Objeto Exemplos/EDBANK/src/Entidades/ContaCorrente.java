package Entidades;

public class ContaCorrente extends Conta
{
	//Atributos
	private int numeroTalao;
	//construtor
	public ContaCorrente(int numero) 
	{
		super(numero);
		
	}
	//encapsulamento
	public int getNumeroTalao() 
	{
		return numeroTalao;
	}
	public void setNumeroTalao(int numeroTalao)
	{
		this.numeroTalao = numeroTalao;
	}
	//metodo
	public void emitirTalao() 
	{
		
		this.numeroTalao = this.numeroTalao+1;
	}
	//Sobrecarga
	public void emitirTalao(int numeroDeTaloes) 
	{
		this.numeroTalao += numeroDeTaloes;
	}
}
