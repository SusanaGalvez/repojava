package edu.arelance.nube.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.arelance.nube.repository.entity.Restaurante;
import edu.arelance.nube.service.RestauranteService;

@RestController// Devolvemos JSOM http:\\localhost:8081\restaurante

@RequestMapping("/restaurante")//Asocia esta peticion a...
class RestauranteController {
	
	@Autowired
	RestauranteService restauranteService;
/**	API Web
	HTTP -> Deriva en la ejecución de un método
	GET-> Consultar TODOS
	GET-> Consultar Uno(Por ID)
	POST-> Insertar un restaurante nuevo
	PUT -> Modificar un restaurante que ya existe
	DELETE->Borrar un restaurante (Por ID)
	GET-> Busqueda -> Pr barrio, por especialidad, por nombre, etc
*/
	@GetMapping("/test")//GET http://localhost:8081/restaurante/test
	public Restaurante obtenerRestauranteTest()
	{
		Restaurante restaurante = null;
		System.out.println("LLamando a obtenerRestauranteTest");
		restaurante = new Restaurante(1l, "Martinete", "Carlos Haya 33", "Carranque", "www.martinete.org", "http://gogle.xe", 33.65f, -2.3f, 10, "gazpachuelo", "paella", "sopa de marisco", LocalDateTime.now());
		
		
		return restaurante;
	}	
	//GET -> Consultar TODOS GET http://localhost:8081/restaurante
	@GetMapping
	public ResponseEntity<?> ResponseEobtenerListadoRstaurante(){
		
		ResponseEntity<?> responseEntity = null;
		Iterable<Restaurante> lista_restaurantes = null;
		
		lista_restaurantes= this.restauranteService.consultarTodos();
		responseEntity= ResponseEntity.ok(lista_restaurantes);
		
		return responseEntity ;
		
	}

}
