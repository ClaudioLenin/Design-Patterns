package com.claudio.inter.impl;

import com.claudio.inter.IConexion;

public class ConexionVacia implements IConexion{
	
	@Override
	public void conectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}
	
	@Override
	public void desconectar() {
		//Aqui puede ir coddigo JDBC
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}
}
