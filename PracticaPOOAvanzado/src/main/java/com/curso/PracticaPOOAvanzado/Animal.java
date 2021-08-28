package com.curso.PracticaPOOAvanzado;

public abstract class Animal {
	
	protected int legs;

	public Animal(int legs) {
		
		this.legs = legs;
	}
	
	
	public  void walk() {System.out.println("El animal tiene " + legs + 
			" patas");};
	public abstract void eat();
	

}
