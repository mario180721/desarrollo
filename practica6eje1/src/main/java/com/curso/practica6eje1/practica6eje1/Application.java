package com.curso.practica6eje1.practica6eje1;



public class Application
{
	public static void main( String[] args )
	{
		
		Bank banco = new Bank();
	    Customer customer;
	    Account account;
		
		
		System.out.println("...............jane..................");
		
		System.out.println(" Creando el cliente Jane Smith");
		banco.addCustomer("Jane", "Simms");
		customer = banco.getCustomer(0);
		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		customer.setAccount(new SavingsAccount(500.00, 0.03));
		
		System.out.println(" Creando el cliente Owen Bryant");
		banco.addCustomer("Owen", "Bryant");
		customer = banco.getCustomer(1);
		System.out.println("Creating her Savings Account with a 500.00 balance and no overdraft protection.");
		customer.setAccount(new CheckingAccount(500.00));
		
		System.out.println(" Creando el cliente Tim Soley");
		banco.addCustomer("Tim", "Soley");
		customer = banco.getCustomer(2);
		System.out.println("Creating her Savings Account with a 500.00 balance and 500.");
		customer.setAccount(new CheckingAccount(500.00,500.00));
		
		System.out.println(" Creando el cliente Maria Soley");
		banco.addCustomer("Maria", "Soley");
		customer = banco.getCustomer(3);
		System.out.println("Maria shares her Checking Account with her husband Tim.");
		customer.setAccount(banco.getCustomer(2).getAccount());
		
		 System.out.println();
		 
		 System.out.println("Retrieving the customer Jane Smith with her savings account.");
		    customer = banco.getCustomer(0);
		    account = customer.getAccount();
		   
		    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		    System.out.println("Deposit 22.50: " + account.deposit(22.50));
		    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		    System.out.println("Customer [" + customer.getLastName()
				       + ", " + customer.getFirstName()
				       + "] has a balance of " + account.getBalance());

		    System.out.println();
		    
		    System.out.println("Retrieving the customer Jane Smith with her savings account.");
		    customer = banco.getCustomer(1);
		    account = customer.getAccount();
		    
		    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		    System.out.println("Deposit 22.50: " + account.deposit(22.50));
		    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		    System.out.println("Customer [" + customer.getLastName()
				       + ", " + customer.getFirstName()
				       + "] has a balance of " + account.getBalance());

		    System.out.println();
		 
		 
		 
		
	}
}