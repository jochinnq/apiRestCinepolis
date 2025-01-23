package com.mx.apiRestCinepolis.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mx.apiRestCinepolis.model.Peliculas;

//los repositorios vienen de spring dasta
//contienen los metodos del crud

public interface PeliculasDao extends CrudRepository<Peliculas,Integer> {
	
	
	// crear un metodo utilizasdo el resorte de los repositorios: findBy
	
	public List<Peliculas>findByNombre(String nombre);

}
