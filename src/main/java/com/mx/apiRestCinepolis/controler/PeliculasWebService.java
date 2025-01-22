package com.mx.apiRestCinepolis.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
	
	

}
