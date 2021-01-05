package CategoriaModel;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class UsuarioModel implements UserDetails, Serializable {
	//previne erros de versões sobrepostas
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS --------------------------------------
	@Id // INDENTIFICADOR (EXEMPLOS, INDENTIDADE,CPF ETC)
	private String login;
	private String nomeCompleto;
	private String senha;
	
	@ManyToMany // Varios para Varios
	//especificando a tabela, e realiza a junção entre elas.
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "login"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "nomeRole"))
	private List<Role> roles;

	// SEGURANÇA-------------------------------------------
	@Override // forma de garantir que esta escrevendo um metodo não um novo.
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return (Collection<? extends GrantedAuthority>) this.roles;
	
	}

	@Override
	public String getPassword() // inserir a senha de acesso
	{
		return this.senha;
	}

	@Override
	public String getUsername() // inserir nome ou o identificador para acesso
	{
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() // Validade de conta.
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() // Indica se o usuario esta bloqueado ou desbloqueado
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() // Se o acesso inspirou
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() // Indica se esta habilitado ou desabilitado
	{
		// TODO Auto-generated method stub
		return true;
	}

	// GETTER E SETTERS encapsula os metodos
	// ------------------------------------------------------
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
