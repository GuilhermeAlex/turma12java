package CategoriaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import CategoriaModel.UsuarioModel;
import CategoriaRepository.UsuarioRepository;

@org.springframework.stereotype.Service
	public class ServiceController
	{
		// implentar a regra de negocio, instanciar o servico de criptografia
		// Encoder poderia ser qlq nome ele vai crypy ou seja ler o GETSENHA/
		// service é uma proteção por isso aparece **** quando esta inserindo a senha, pois ela nao pode ficar visivel.
		// Salva criptografando a senha do usuario.
		@Autowired
		private UsuarioRepository repository;
		
		public UsuarioModel CadastrarUsuario(UsuarioModel usuario) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);
			return repository.save(usuario);
		}
	}

