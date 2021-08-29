package com.curso.practica6eje1.practica6eje1;

public class TestReport {
	 public static void main(String[] args) {
	     //   Bank     bank = new Bank();
	       initializeCustomers();
	        
	        // inicializa  report
	        CustomerReport report = new CustomerReport();
	        //report.setBank(bank);
	        report.generateReport();
	    }
	    
	   

		private static void initializeCustomers() {
	        Customer customer;
	        
	        // crea clientes y cuentas
	        Bank.addCustomer("Jane", "Simms");
	        customer = Bank.getCustomer(0);
	        customer.addAccount(new SavingsAccount(500.00, 0.05));
	        customer.addAccount(new CheckingAccount(200.00, 400.00));
	        
	        Bank.addCustomer("Owen", "Bryant");
	        customer = Bank.getCustomer(1);
	        customer.addAccount(new CheckingAccount(200.00));
	        
	        Bank.addCustomer("Tim", "Soley");
	        customer = Bank.getCustomer(2);
	        customer.addAccount(new SavingsAccount(1500.00, 0.05));
	        customer.addAccount(new CheckingAccount(200.00));
	        
	        Bank.addCustomer("Maria", "Soley");
	        customer = Bank.getCustomer(3);
	        
	        
	        
	        customer.addAccount(Bank.getCustomer(2).getAccount(1));
	        customer.addAccount(new SavingsAccount(150.00, 0.05));
	    }

}
