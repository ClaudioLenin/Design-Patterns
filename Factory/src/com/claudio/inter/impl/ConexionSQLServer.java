package com.claudio.inter.impl;

import com.claudio.inter.IConexion;

public class ConexionSQLServer implements IConexion{
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}
	
	@Override
	public void conectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se conectó a SQLServer");
	}
	
	@Override
	public void desconectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("Se desconectó a SQLServer");
	}
}
