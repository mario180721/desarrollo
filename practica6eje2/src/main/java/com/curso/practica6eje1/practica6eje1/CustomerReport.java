package com.curso.practica6eje1.practica6eje1;

public class CustomerReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("CUSTOMERS REPORT \n"+"================");
		
		Customer c1=new Customer("Jane", "Smith");
		SavingsAccount j1= new SavingsAccount(500,0);
		CheckingAccount c =new CheckingAccount(500.00,300);
		
		System.out.println(" Customer: " + c1.getFirstName()+" "+c1.getLastName());
		System.out.println(" Savings Account:" + j1.getBalance());
		System.out.println(" Savings Account:" + c.getBalance());

		
	}

}
