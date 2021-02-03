package com.claudio;

import com.claudio.model.Conexion;

public class App {

	public static void main(String[] args) {
		//Instanciación por constructor prohibído por ser private
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
}
