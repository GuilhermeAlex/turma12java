package Classes;

public class Exec1Pessoa 
{
	//ATRIBUTOS DA CLASSE 
	private String nome;
	private String endereco;
	private String telefone;
	
	// construtor
	public Exec1Pessoa() //padrão
	{
		
	}
	public Exec1Pessoa (String nome, String endereco, String telefone) //sobrecarga
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//encapsulamento - getter e setters
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String Nome) 
	{
		this.nome = nome;
	}
	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}

}
