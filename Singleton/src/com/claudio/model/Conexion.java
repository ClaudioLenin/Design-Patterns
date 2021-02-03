package com.claudio.model;

public class Conexion {
	
	//Declaracion
	private static Conexion instancia;
	//private static Conexion instancia = new Conexion();
	
	//Para evitar instancia mediante operador 'new'
	private Conexion() {
		
	}
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada 'static' hace posible el acceso meddiante Clase.metoddo
	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
		
	}
	
	//M�todo de prueba 
	public void conectar() {
	System.out.println("Me conect� a la BD");
	}
	
	//M�todo de prueba 
	public void desconectar() {
		System.out.println("Me desconect� de la BD");
	}
}
