package Entidades;

public class Aluno {
	
			//atributos 
	
		private int matricula;
		private String nome;
		private int anoNascimento;
		private char genero;
		private boolean ativo; 
		public String seuGenero;
		public int idade;
		
		//GET PUXA E O SET ALTERA
		//construtor padrão
		public Aluno() 
		{
			
		}
		//construtor sobrecarga
		public Aluno(int matricula, String nome)
		{
			
			this.matricula = matricula;
			this.nome = nome;
		}
		
		
		public int getMatricula()
		{
			return matricula;
		}
		public void setMatricula(int matricula)
		{
			this.matricula = matricula;
		}
		public String getNome() 
		{
			return nome;
		}
		public void setNome(String nome)
		{
			this.nome = nome;
		}
		public int getAnoNascimento()
		{
			return anoNascimento;
		}
		public void setAnoNascimento(int anoNascimento)
		{
			this.anoNascimento = anoNascimento;
		}
		public char getGenero() {
			return genero;
		}
		public void setGenero(char genero)
		{
			this.genero = genero;
		}
		
		public  String seuGenero()
		{
			String texto="";
					
		if (this.genero == 'M') 
		{
			texto = "Aluno";
		}
		else if (this.genero=='F')
		{
			System.out.println("Oi aluna");
		}
		else if (this.genero == 'O')
		{
			System.out.println("Oi alune");
		}
		return texto; 
			
		}
		public int idade() //informando o ano
		{
			return 2020- this.anoNascimento;
			
					
		}
		public int idade (int anoAtual) //sobrecarga 
		{
		return 	anoAtual- this.anoNascimento;
		
		}
		public void situacao () 
		{
			this.ativo=true;
			
		}
		public void situacao (char status) 
		{
			if (status == 'A' ) 
			{
				this.ativo= true;
			}
		
			else 
			{
			this.ativo=false;
			}
		}

}
