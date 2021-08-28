package com.curso.PracticaPOOAvanzado;

public class Cat extends Animal implements Pet {
	
	
	private String nombre;

	
	public Cat(String n) {
		super(4);
		nombre = n;
		}

	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("La araña come pescado");
		
	}


	public String getNombre() {
		return nombre;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(nombre + " juega con bolas.");
	}



	
}
