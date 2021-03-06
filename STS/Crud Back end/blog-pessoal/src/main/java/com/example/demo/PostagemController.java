package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //informa para o spring que ele é um controlador 
@RequestMapping("/postagens")// qual é a RI(oq esta dentro ("/") que essa classe será acessada como a principal 
@CrossOrigin("*")//Ele vai aceitar requicoes de qlq origin

public class PostagemController
{
	@Autowired //para instanciar essa interface, injecao 
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemModel>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping ("/{id}")
	public ResponseEntity<PostagemModel>GetById(@PathVariable long id)
	{
			return repository.findById(id)
					.map(resp ->ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		
	}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<PostagemModel>>GetByTitulo(@PathVariable String titulo)
	{
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	@PostMapping
	public ResponseEntity<PostagemModel> post (@RequestBody PostagemModel postagem)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	@PutMapping
	public ResponseEntity<PostagemModel> put (@RequestBody PostagemModel postagem)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	@DeleteMapping("/{id}")// void nao vai retornar nada 
	public void delete(@PathVariable long id) 
	{
		repository.deleteById(id);//como ele é um void nao tem return 
	}
	
}
