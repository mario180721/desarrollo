package com.curso.mybank;

public class Application
{
	public static void main( String[] args )
	{
		
		Customer c1=new Customer("Jane", "Smith");
		
		System.out.println(" Creando el cliente " + c1.getFirstName()+" "+c1.getLastName());

		
	}
}