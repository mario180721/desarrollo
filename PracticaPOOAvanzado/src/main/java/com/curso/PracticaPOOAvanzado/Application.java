package com.curso.PracticaPOOAvanzado;

public class Application
{
	public static void main( String[] args )
	{
		
		
		Cat gato =new Cat("Pipo");
		Fish nemoFish = new Fish ();
		Animal adolfo= new Fish();
		Animal erwe= new Spider(8);
		Pet mkm = new Cat("eldre");
		
		
		
		gato.play();
		nemoFish.eat();
		adolfo.eat();
		erwe.eat();
		nemoFish.walk();
		mkm.getName();
		
		
		
		
		
		
		
	}
}