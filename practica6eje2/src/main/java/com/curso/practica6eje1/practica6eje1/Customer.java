package com.curso.practica6eje1.practica6eje1;


public class Customer {

	
	private  String firstName;
	private  String lastName;
	
    private Account [] accounts;
    private int [] numberOfAccounts;
	//Account account;
	
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int[] getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public void setNumberOfAccounts(int[] numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}


	
	
	
	
}
