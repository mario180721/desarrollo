package com.curso.practica6eje1.practica6eje1;


public class Customer {

	
	private  String firstName;
	private  String lastName;
	
    private Account [] accounts;
    private int numberOfAccounts;
	//Account account;
	
	


	public Customer(String firstName, String lastName, Account[] accounts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new Account[10];
		numberOfAccounts = 0;

	}


	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public void setNumberOfAccounts(int numberOfAccounts) {
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


	
	public void addAccount(Account obj) {
		
		int i = numberOfAccounts++;
		accounts[i] = obj;
		
	}
	
	public int getNumOfAccounts() {
		return numberOfAccounts;
		}

	public Account getAccount(int account_index) {
		return accounts[account_index];
	}
	
}
