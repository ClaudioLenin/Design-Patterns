package com.claudio;

import com.claudio.model.Conexion;

public class App {

	public static void main(String[] args) {
		//Instanciaci�n por constructor prohib�do por ser private
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
}
