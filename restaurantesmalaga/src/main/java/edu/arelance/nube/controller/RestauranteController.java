package edu.arelance.nube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arelance.nube.repository.entity.Restaurante;

@RestController// Devolvemos JSOM http:\\localhost:8081\restaurante

@RequestMapping("/restaurante")//Asocia esta peticion a...
class RestauranteController {
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
	public Restaurante obtenerREstauranteTest()
	{
		Restaurante restaurante = null;
		System.out.println("LLamando a obtenerRestauranteTest");
		
		
		return restaurante;
	}	

}
