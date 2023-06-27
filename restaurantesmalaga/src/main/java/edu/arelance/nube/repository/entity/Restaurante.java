package edu.arelance.nube.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantes")
public class Restaurante {
	@Id//Indico a Spring que este será la clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String direccion;
	
	private String barrio;
	
	private String web;
	
	private String fichaGoogle;
	
	private float latitud;
	
	private float longitud;
	
	private Integer precio;
	
	private String especialidad1;
	
	private String especialidad2;
	
	private String especialidad3;
	
	
	
	

}
