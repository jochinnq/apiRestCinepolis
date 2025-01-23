package com.mx.apiRestCinepolis.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiClientesBancomer.model.Empleados;
import com.mx.apiRestCinepolis.model.Peliculas;
import com.mx.apiRestCinepolis.service.PeliculaServImp;

//web service; es una tecnologia que me permite comnnovcar dos componentes servidor y cliente

//Web service: Es una tecnologia que me permite comunicar 2 componentes: Servidor y Cliente

//@RestController---Nos permite marcar como controlador de solicitudes y se utiliza para 
//crear servicios web --- web service de tipo rest ---trabajan con json

//@RequestMapping---se utiliza para asiganar solicitudes web a entonrnos de spring
//o para forar nuestros recursos(url, endpoint)

//@CrossOrigin---es por seguridad para que nuestra aplicacion no sea bloquedao por el navegador
@RestController
@RequestMapping(path ="PeliculasWebService")
@CrossOrigin
public class PeliculasWebService {
	
	@Autowired
	PeliculaServImp peliculaImp;
	
	//peticion ---get para listar
	//nececito formar la url utilizando el protocolo http
	//http://localhost:9000/PeliculasWebService/listar
	//como formsr laas url urlServidorLoca/patMiclase/pathMetodo
	// MY FIRST END POINT

	
	@GetMapping(path = "listar")
	
	public List<Peliculas> listar(){
		return peliculaImp.listar();
		
	}
	//http://localhost:9000/PeliculasWebService/guardar
	@PostMapping(path= "guardar")
	public void guardar(@RequestBody Peliculas pelicula) {
		peliculaImp.guardar(pelicula);
	}
	//http://localhost:9000/PeliculasWebService/buscarXid
	@PostMapping(path= "buscarXid")
	public Peliculas buscar(@RequestBody Peliculas pelicula) {
		return peliculaImp.buscarXid(pelicula.getIdPeli());
	}
	
	//http://localhost:9000/PeliculasWebService/editar
    @PostMapping(path = "editar")
    public void editar(@RequestBody Peliculas pelicula) {
    	peliculaImp.editar(pelicula);
    }
    //http://localhost:9000/PeliculasWebService/eliminar
    @PostMapping("eliminar")
    public void eliminar(@RequestBody Peliculas pelicula) {
    	peliculaImp.eliminarXid(pelicula.getIdPeli());
    }
    
  //http://localhost:9000/PeliculasWebService/buscarXnombre
    @PostMapping("buscarXnombre")
    public List<Peliculas>buscarXnombre(@RequestBody Peliculas pelicula){
    	return peliculaImp.buscarXnombre(pelicula.getNombre());
    }
    
    
  //http://localhost:9000/PeliculasWebService/buscarXgenero
    @PostMapping("buscarXgenero")
    public List<Peliculas> buscarXgenero(@RequestBody Peliculas genero){
    	return peliculaImp.buscarXgenero(genero.getGenero());
    }
    
  
	
	

}
