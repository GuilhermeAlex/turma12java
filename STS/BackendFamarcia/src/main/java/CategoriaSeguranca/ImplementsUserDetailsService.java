package CategoriaSeguranca;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import CategoriaModel.UsuarioModel;
import CategoriaRepository.UsuarioRepository;

@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService // buscar o login e senha detalhes de usuario
{
	@Autowired // injetanta do repositorio do usuario ou seja o login
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		UsuarioModel usuario = usuarioRepository.findByLogin(login);
		
		if(usuario == null){
			throw new UsernameNotFoundException("Usuario(a) não encontrado(a)!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
}
}
