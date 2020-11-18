package Aplicacao;

import Entidades.ContaEspecial;
import Entidades.ContaPoupanca;
import Entidades.Contas;

public class TesteContas {

	public static void main(String[] args)
	{
		Contas conta1 = new Contas ("1111",1);
		ContaPoupanca contapop = new ContaPoupanca("2222",3,24);
		ContaEspecial contaesp1 = new ContaEspecial();
		
		conta1.credite(100);
		System.out.println(contapop.getSaldo());
		
	}

}
