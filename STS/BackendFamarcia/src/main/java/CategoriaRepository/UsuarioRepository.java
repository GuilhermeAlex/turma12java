package CategoriaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import CategoriaModel.UsuarioModel;




public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> //Herdando uma funcao da jpa, extenção dessa herança
{
	
	UsuarioModel findByLogin(String login); // Puxa informações de cada usuario. **** 
}

