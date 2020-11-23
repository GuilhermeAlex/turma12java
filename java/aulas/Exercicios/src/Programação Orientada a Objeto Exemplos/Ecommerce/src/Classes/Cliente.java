package Classes;

public class Cliente 
{
	//ATRIBUTOS
	private String nome;
	private String email;
	private int cpf;
	
	//CONSTRUTOR PADRÃO
	public Cliente() 
	{
		super();
	}

	//CONSTRUTORES
	public Cliente(String nome, int cpf) 
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	//GETTERS E SETTERS
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getCpf() 
	{
		return cpf;
	}

	public void setCpf(int cpf) 
	{
		this.cpf = cpf;
	}
	
	
}//CHAVE PUBLIC CLASS
