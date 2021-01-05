package CategoriaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import CategoriaModel.PostagemModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long> 
{
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);


}
