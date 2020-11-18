package Entidades;

public class Contas {
	
	//atributos
	private String cpf;
	private double saldo;
	private int numero;
	
	//construtor
	public Contas (String cpf,int numero) 
	{
		this.cpf=cpf;
		this.numero=numero;
	}

	//encapsulamento total = getter e setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}
	public double getSaldo() 
	{
		return this.saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//metodos gerais
	public void debite(double valorDebito) //metodo debite
	{
		this.saldo= this.saldo - valorDebito;
		
	}
	 public void credite (double valorCredito) //metodo credite
	 {
		 this.saldo= this.saldo+valorCredito;
	 }
	
	
}
