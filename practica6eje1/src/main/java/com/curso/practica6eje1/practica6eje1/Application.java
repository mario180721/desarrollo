package com.curso.practica6eje1.practica6eje1;



public class Application
{
	public static void main( String[] args )
	{
		
		
		
		Customer c1=new Customer("Jane", "Smith");
		
		SavingsAccount j1= new SavingsAccount(500,3);
		CheckingAccount c =new CheckingAccount(500.00);
		
		System.out.println("...............jane..................");
		
		System.out.println(" Creando el cliente " + c1.getFirstName()+" "+c1.getLastName());
		System.out.println(" Creating her Savings Account with" + j1.getBalance()+" "+j1.getInterestRate()+"%");
		System.out.println("Retrieving the customer Jane Smith with her savings acount");
		System.out.println("Withdraw 150: "+c.withdraw(150));
		System.out.println("Deposit 22.50:: "+c.deposit(22.5));
		System.out.println("Withdraw 47.62: "+c.withdraw(47.62));
		System.out.println("Withdraw 400: "+c.withdraw(400));
		System.out.println("Customer["+ c1.getFirstName()+"] Tiene un saldo de "+c.getBalance());

		
Customer c2=new Customer("Owen", "Bryant");
		
		SavingsAccount j2= new SavingsAccount(500,0);
		CheckingAccount c22 =new CheckingAccount(500.00);
		
		System.out.println("............... Owen Bryant ..................");
		
		System.out.println(" Creando el cliente " + c2.getFirstName()+" "+c2.getLastName());
		System.out.println(" Creating her Savings Account with" + j2.getBalance()+" "+j2.getInterestRate()+"%");
		System.out.println("Retrieving the customer Jane Smith with her savings acount");
		System.out.println("Withdraw 150: "+c22.withdraw(150));
		System.out.println("Deposit 22.50:: "+c22.deposit(22.5));
		System.out.println("Withdraw 47.62: "+c22.withdraw(47.62));
		System.out.println("Withdraw 400: "+c22.withdraw(400));
		System.out.println("Customer["+ c2.getFirstName()+"] Tiene un saldo de "+c22.getBalance());

		
Customer c3=new Customer("Tim", "Soley");
		
		SavingsAccount j3= new SavingsAccount(500,0);
		CheckingAccount c33 =new CheckingAccount(500.00,500);
		
		System.out.println("...............  Tim Soley..................");
		
		System.out.println(" Creando el cliente " + c3.getFirstName()+" "+c3.getLastName());
		System.out.println(" Creating her Savings Account with" + j3.getBalance()+" "+j2.getInterestRate()+"%");
		System.out.println("Retrieving the customer Jane Smith with her savings acount");
		System.out.println("Withdraw 150: "+c33.withdraw(150));
		System.out.println("Deposit 22.50:: "+c33.deposit(22.5));
		System.out.println("Withdraw 47.62: "+c33.withdraw(47.62));
		System.out.println("Withdraw 400: "+c33.withdraw(400));
		System.out.println("Customer["+ c3.getFirstName()+"] Tiene un saldo de "+c33.getBalance());

		
Customer c4=new Customer("Maria", "Soley");
		
		SavingsAccount j4= new SavingsAccount(500,0);
		CheckingAccount c44 =new CheckingAccount(500.00);
		
		System.out.println("...............  Maria shares her Checking Account with her husband Tim...................");
		
		System.out.println(" Creando el cliente " + c4.getFirstName()+" "+c4.getLastName());
		System.out.println(" Creating her Savings Account with" + j4.getBalance()+" "+j4.getInterestRate()+"%");
		System.out.println("Retrieving the customer Jane Smith with her savings acount");
		System.out.println("Withdraw 150: "+c44.withdraw(150));
		System.out.println("Deposit 22.50:: "+c44.deposit(22.5));
		System.out.println("Withdraw 47.62: "+c44.withdraw(47.62));
		System.out.println("Withdraw 400: "+c44.withdraw(400));
		System.out.println("Customer["+ c4.getFirstName()+"] Tiene un saldo de "+c44.getBalance());

		
		
		
	}
}