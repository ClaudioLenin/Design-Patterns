package com.claudio.inter.impl;

import com.claudio.inter.IConexion;

public class ConexionOracle implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}
	
	@Override
	public void conectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se conectó a Oracle");
	}
	
	@Override
	public void desconectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se desconectó a Oracle");
	}
}
