package com.curso.practica6eje1.practica6eje1;

public class OverdraftException extends Exception {

	
	private double deficit;

	public OverdraftException(String mensaje,double deficit) {
		super(mensaje);
		this.deficit = deficit;
	}
	
	
	
	public double getDeficit() {
		
		return deficit;
		
	}
	
}
