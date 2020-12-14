package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios") //ACESSANDO POR MEIO DO USUARIOS
@CrossOrigin(origins = "*", allowedHeaders = "*") //TODAS AS ORIGENS E DENTRO DOS HEADERS VAI ACEITAR QUALQUER INFORMAÇÃO
public class UsuarioController {
	
	//INJETANDO A CLASSE DE SERVIÇOS QUE É A (SERVICE)
	@Autowired
	private UsuarioService usuarioService;
	//MÉTODO LOGAR
	//O USUARIO Ñ TERÁ ACESSO AO LOGIN E SENHA QUE FOI PASSADO AO API, ISSO É UM MÉTODO DE SEGURANÇA A MAIS
	//POR MEIO DA PATHVARIABLE NÃO SERIA SEGURO
	@PostMapping("/logar")//CAMINHO VAI SER PELO /LOGAR
	//RETORNARÁ O USERLOGIN, VAI RECEBER PELA BODY, VINDO ALGO OU Ñ
	public ResponseEntity<UserLogin> Autentication (@RequestBody Optional<UserLogin> user) {
		//SE O USUARIO INSERIR ERRADO VAI NOTIFICAR UM "NÃO AUTORIZADO"
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
		//METODO CADASTRAR
		@PostMapping("/cadastrar")
		public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario) {
			//CHAMANDO O METODO DO REPOSITORY
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(usuarioService.CadastrarUsuario(usuario));
		}
	
}
