package Entidades;

public class ContaEspecial extends ContaCorrente
{
	//atributos
	private double limite;
	//construtor
	public ContaEspecial(int numero,double limite) 
	{
		super(numero);
		this.limite = limite;
	}
	//encapsulamento
	public double getLimite() 
	{
		return limite;
	}

	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	//metodo
	public void usarLimite () 
	{
		if (super.getSaldo()<0);
		super.creditar(valor);
		this.limite -= valor;
		// O de cima é a msm coisa this.limite = this.limite - valor;
	}

}
