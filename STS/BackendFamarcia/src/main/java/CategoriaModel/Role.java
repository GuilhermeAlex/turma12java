package CategoriaModel;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

public class Role {
	public class RoleModel implements GrantedAuthority // Ela confere a permissão de acesso
	{
		@Id
		private String nomeRole;

		@ManyToMany(mappedBy = "roles") // mapped ele busca informação dentro da role.
		private List<UsuarioModel> usuarios;

		@Override
		public String getAuthority() {
			// TODO Auto-generated method stub
			return this.nomeRole;
		}

		public String getNomeRole() {
			return nomeRole;
		}

		public void setNomeRole(String nomeRole) {
			this.nomeRole = nomeRole;
		}

		public List<UsuarioModel> getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(List<UsuarioModel> usuarios) {
			this.usuarios = usuarios;
		}
	}

}
