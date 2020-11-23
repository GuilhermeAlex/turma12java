package Entidades;

public class ContaPoupanca extends Conta
{	//Atributos
	private int dataAniversario;
	//construtor
	public ContaPoupanca(int numero, int dataAniversario) 
	{
		super(numero);
		this.dataAniversario = dataAniversario;
	}
	//forçando metedodos
	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}
	//encapsulamento
	public int getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	//metodo
	public void correcao(int data) 
	{
		double novosaldo = 0.0;
		
		//saldo não pode ser vazio nem negativo
		// comparo a data do niver com a data informada se sim roda correcao
		// saldo + (saldo *0,5%) ou seja no cod vai ser (saldo* 0.005)
		if (super.getSaldo()>=0 && data == this.dataAniversario) 
		{
			novosaldo= super.getSaldo() * 0.005;
			super.creditar(novosaldo);
		}
	}
}
