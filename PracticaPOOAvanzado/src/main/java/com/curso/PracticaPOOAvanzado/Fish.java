package com.curso.PracticaPOOAvanzado;

public class Fish extends Animal implements Pet {
	
	protected String nombre;


	public Fish() {
		super(0);
		
	}

	public Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
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
		System.out.println("Los peces hacen carreras");

	}

	@Override
	public void walk() {
		super.walk();
		
		System.out.println("Los peces no andan");
	}
	
	
	@Override
	public void eat() {
		System.out.println("La peces come placton");
		
	}

}
