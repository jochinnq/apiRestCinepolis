package com.mx.apiRestCinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public Peliculas buscarXid(int idPeli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarXid(int idPel) {
		// TODO Auto-generated method stub
		
	}

}
