package com.mx.apiRestCinepolis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiClientesBancomer.model.Empleados;
import com.mx.apiRestCinepolis.dao.PeliculasDao;
import com.mx.apiRestCinepolis.model.Peliculas;

//se agrega este estereotipo
//@Service --con esto le indicamos que vamos a realizar un servicio rest--json 
@Service

public class PeliculaServImp implements PeliculaServ {
	
	//realizar la inyeccion de dependencia
		//@Autowired---- nos permite tener un mejor control de los objetos que se inicializan
		
		@Autowired
		PeliculasDao dao;
		@Transactional  // se agrega cunado vamos a realizar cambios
		
		

	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
			dao.save(pelicula);
		
		
	}

		@Transactional(readOnly = true)
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return (List<Peliculas>) dao.findAll();
	}
   @Transactional(readOnly = true)
	@Override
	public Peliculas buscarXid(int idPeli) {
		// TODO Auto-generated method stub
		Optional<Peliculas>peliculaOptional= dao.findById(idPeli);
		
		return peliculaOptional.orElse(null);
	}

	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		
		dao.save(pelicula);
		
	}
	@Transactional
	@Override
	public void eliminarXid(int idPel) {
		// TODO Auto-generated method stub
		dao.deleteById(idPel);
		
	}

@Transactional(readOnly= true)
	@Override
	public List<Peliculas> buscarXnombre(String nombre) {
		// TODO Auto-generated method stub
		List<Peliculas>lista= dao.findByNombre(nombre);
		return lista;
	}
	

	@Override
	public List<Peliculas> buscarXgenero(String genero) {
		
		List<Peliculas> buscarGenero= new ArrayList<Peliculas>();
		
		for(Peliculas pelicuala: listar()) {
			if(pelicuala.getGenero().equals(genero)) {
				buscarGenero.add(pelicuala);
				
			}
			
			
		}
		// TODO Auto-generated method stub
		return buscarGenero;
	}

}
