package com.claudio.inter.impl;

import com.claudio.inter.IConexion;

public class ConexionPostgreSQL implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}
	
	@Override
	public void conectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se conectó a PostgreSQL");
	}
	
	@Override
	public void desconectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se desconectó a PostgreSQL");
	}
}
