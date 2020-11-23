package Entidades;

public class ContaEmpresa extends Conta
{
	//Atributos
	private double emprestimo;
	//construtor
	public ContaEmpresa(int numero, String cpf_cnpj) 
	{
		super(numero, cpf_cnpj);
		
	}
	
	public double getEmprestimo() 
	{
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) 
	{
		this.emprestimo = emprestimo;
	}
	//metodos
	private double valorEmprestimo() 
	{
		return 0;
	}
	//metodos
	public void pedirEmprestimo (double valorEmprestimo) 
	{
		//saldo pode ser 0 e negativo
		// valor do emprestimo ñ pode ser maior que o valor emprestimo
		
		
			if (valorEmprestimo()<= this.emprestimo);
			{
				super.creditar(valorEmprestimo);
				this.emprestimo -= valorEmprestimo;
			}
	}

	
			
	
	
	
	
	
	
}
