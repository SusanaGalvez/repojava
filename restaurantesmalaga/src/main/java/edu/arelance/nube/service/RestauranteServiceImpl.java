package edu.arelance.nube.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.arelance.nube.repository.RestauranteRepository;
import edu.arelance.nube.repository.entity.Restaurante;

@Service
public class RestauranteServiceImpl implements RestauranteService{
	
	RestauranteRepository restauranteRepository;//Esto es un atributo de la clase, pero más adelante será
	//un instancia
	
	@Override
	@Transactional (readOnly = true)
	public Iterable<Restaurante> consultarTodos() {
		 return this.restauranteRepository.findAll();
		// return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Restaurante> consultarRestaurante(Long id) {
	 return this.restauranteRepository.findById(id);
	 //Optional<Restaurante>
	}

	@Override
	public Restaurante altaRestaurante(Restaurante restaurante) {
		return this.restauranteRepository.save(restaurante);
	}

	@Override
	public void borrarRestaurante(Long id) {
		this.restauranteRepository.deleteById(id);
		//return null
		
	}

	@Override
	public Optional<Restaurante> modificarRestaurante(Long id, Restaurante restaurante) {
		
		return Optional.empty();
	}

	
}
