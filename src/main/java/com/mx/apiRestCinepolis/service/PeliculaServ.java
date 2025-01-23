package com.mx.apiRestCinepolis.service;


import java.util.List;

import com.mx.apiRestCinepolis.model.Peliculas;



public interface PeliculaServ {
	public void guardar (Peliculas pelicula);
	public List<Peliculas>listar();
	public Peliculas buscarXid(int idPeli);
	public void editar(Peliculas pelicula);
	public void eliminarXid(int idPel);
	
	public List<Peliculas>buscarXnombre(String nombre);
	
	public List<Peliculas>buscarXgenero(String genero);

	

}
