package Classes;

public class Terceiro extends Funcionario
{
	//Atributos
	private double adicional;

	public Terceiro()//padrão vazio 
	{
		super();
	}
	//construtor completo
	public Terceiro(String cod, double horas, double valorhora, double adicional) 
	{
		super(cod, horas, valorhora);
		this.adicional = adicional;
	}
	//getters e setters
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamentoSalario() 
	{
		return this.valorhora * this.valorhora + this.adicional;
	}
	
	
	
	
	
}
