package com.curso.practica6eje1.practica6eje1;

public class CustomerReport {
    
   // private Bank bank;
    
    public CustomerReport() {
    }
    
   /* public Bank getBank() {
        return bank;
    }*/
    
    /*public void setBank(Bank bank) {
        this.bank = bank;
    }*/
    
    public void generateReport() {
        
    	// Imprimir encabezado del informe
    	System.out.println("CUSTOMERS REPORT");
    	System.out.println("================");
    	// Para cada cliente...
    	for ( int cust_idx = 0;
    	cust_idx < Bank.getNumOfCustomers();
    	cust_idx++ ) {
    	Customer customer = Bank.getCustomer(cust_idx);
    	// y así sucesivamente
    }
}}
