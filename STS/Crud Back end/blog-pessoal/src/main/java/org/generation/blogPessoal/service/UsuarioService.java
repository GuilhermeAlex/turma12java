package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario CadastrarUsuario(Usuario usuario) {
		//INSTANCIANDO OBJETO
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha()); //SENHA QUE O USUARIO INSERIR
		usuario.setSenha(senhaEncoder); //PASSANDO A SENHA INCRIPTADA
		
		return repository.save(usuario); //SALVANDO A SENHA QUE JÁ ESTÁ INCRIPTADA
	}
	//Utilizando o objeto do tipo UserLogin, pois vou retornar o (nome,usuario,senha,token)
	public Optional<UserLogin> Logar(Optional<UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario()); //RECEBENDO O USUARIO DO OBJETO USER POR MEIO DO GET USUARIO
		//COMPARANDO A SENHA CADASTRADA COM A QUE O USUARIO DIGITOU
		if (usuario.isPresent()) {
			//PEGANDO A SENHA INCRIPTADA E A OUTRA QUE NÃO ESTÁ E VAI VERIFICAR SE É IGUAL
			//SE FOR IGUAL VAI SER TRUE E ENTRA NO IF
			if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				//USERNAME E SENHA DENTRO DE UMA STRING
				String auth = user.get().getUsuario() + ":" + user.get().getSenha(); 
				
				byte [] encodedAuth= Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic " + new String (encodedAuth);
				//PREENCHENDO O TOKEN
				user.get().setToken(authHeader);
				//ACESSANDO POR MEIO DO SET
				user.get().setNome(usuario.get().getNome());
				//RETORNANDO O USER
				return user;
				
			}
		}
		//SE NÃO ENTROU NAQUELE IF VAI RETORNAR NULO OU  NULL
		//COM ISSO O SISTEMA VAI ENTENDER QUE NÃO EXISTE ESSE USUARIO NO NOSSO BANCO DE DADOS
		return null;
	}
}
