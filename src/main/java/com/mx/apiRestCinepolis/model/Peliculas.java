package com.mx.apiRestCinepolis.model;


import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
CREATE TABLE PELICULAS(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(70)NOT NULL,
GENERO NVARCHAR2(70)NOT NULL,
PRECIO NUMBER NOT NULL	
);
*/
//mapear tabla
//esterotipos o anotaciones-- ESTAMOS OCUPANDOdependencias
@Entity
@Data// gets y gets, tostring
@NoArgsConstructor //constructor vacio
@AllArgsConstructor// constructor con parametros

@Table(name="PELICULAS")

public class Peliculas {
	@Id
	
	@Column(name= "ID_PELICULA", columnDefinition = "NUMBER", nullable= false)
	private Integer idPeli;
	
	@Column(name= "NOMBRE", columnDefinition = "NVARCHAR2(70)", nullable= false)
	private String nombre;
	
	@Column(name= "GENERO", columnDefinition = "NVARCHAR2(70)", nullable= false)
	private String genero;
	
	@Column(name= "PRECIO", columnDefinition = "NUMBER", nullable= false)
	private Float precio;
	
	
	
	//los tipos de datos primtivos de preferrencdia hay que parsearlo
	//un tipo de dato primitivo queno esta parsado no recibe valores nulos
	
	
	

}
