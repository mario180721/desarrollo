package com.curso.mybank;

public class TestBanking {

	public static void main(String[] args) {
		
		Customer c1=new Customer("Mario", "Crespo");
		Account c =new Account(500.00);
		
		
		System.out.println(" Creando el cliente " + c1.getFirstName()+" "+c1.getLastName());
		System.out.println(" Creando su cuenta bancaria con el saldo " + c.getBalance());
		System.out.println(" Sacar 150" +" "+c.withdraw(-150.00));
		System.out.println(" Ingresar 22.50"+" "+ c.deposit(22.50));;
		System.out.println(" Sacar 47.62"+" "+ c.withdraw(-47.62));
		System.out.println(" Sacar 400.00"+" "+ c.withdraw(-400.00));
		System.out.println("Customer["+ c1.getFirstName()+"] Tiene un saldo de "+c.getBalance());
		

	}

}
