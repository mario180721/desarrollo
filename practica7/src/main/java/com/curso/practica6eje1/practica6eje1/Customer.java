package com.curso.practica6eje1.practica6eje1;


public class Customer {

	
	private  String firstName;
	private  String lastName;
	//private Account account;
	private Account accounts [];
	private  int numberOfAccounts;
	
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts =new Account[10];
		numberOfAccounts = 0;
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

	
	public void addAccount(Account o) {
		int i = numberOfAccounts++;
		
		accounts[i] = o;

	}
	
	public Account getAccount(int cuenta) {
		return accounts[cuenta];
	}
	 
	
	public int getNumOfAccounts() {
		
		return numberOfAccounts;
		
	}
	
}
