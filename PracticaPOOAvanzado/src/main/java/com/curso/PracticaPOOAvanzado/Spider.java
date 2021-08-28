package com.curso.PracticaPOOAvanzado;

public class Spider extends Animal {

	public Spider(int legs) {
		super(8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("La araña come moscas con sus "+legs+"patas");
		
	}

}
