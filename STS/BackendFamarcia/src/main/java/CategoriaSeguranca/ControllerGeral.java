package CategoriaSeguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import CategoriaModel.TemaModel;
import CategoriaRepository.TemaRepository;
//ele vai conectar com a tabela manutencao, ou seja, qdo vamos fazer o
	// controler, precisamos
	// injetar o caminhao que vai levar os dados ate a tabela
	// @autowired injecao e repository é o caminhao que leva os dados na tabela
@Controller //controla toda as classe, quais são os links e quais são as suas funções.
public class ControllerGeral
{
		
		@Autowired
		private TemaRepository repository;
		
		//localhost:8080 <- direciona p a index
		@GetMapping(value= "/")
		public String login() {
			return "index";
		}	
		@GetMapping(value="/cadastrarTema")
		public String form(){
			return "formTema";
		}	
		
		// post inserir
		// este metodo criar vai salvar as informacoes la no banco
		// insert ---------localhost:8080/pagina/manutencoes
		@PostMapping(value="/cadastrarTema")
		public String form(TemaModel tema){			
			repository.save(tema);
			return "redirect:/cadastrarTema";
		}
	}
	//Find All
	// Save
	// FindByid
	// deleteByid
	// insert into tb_manutencao "OQUE A PESSOA DIGITAR NO BODY"
