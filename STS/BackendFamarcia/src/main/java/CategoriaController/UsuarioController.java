package CategoriaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CategoriaModel.UsuarioModel;


//Banco repository(persistir)JPA-->service(criptografar)CRIPTO-->controller(EndPOint,Post(cadastrar),salvando o service)POST

//JUNCAO DE TODOS DO BANCO.
@RestController
public class UsuarioController
{
	@Autowired
	private ServiceController usuarioService;
	
	@PostMapping ("/cadastrar")
	public ResponseEntity<UsuarioModel> Post(@RequestBody UsuarioModel usuario)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
}
