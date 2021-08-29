package com.curso.practica6eje1.practica6eje1;

public class CustomerReport {
    
    private Bank bank;
    
    public CustomerReport() {
    }
    
    public Bank getBank() {
        return bank;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    public void generateReport() {
        
        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        
        // Para cada cliente
        for ( int cust_idx = 0;
        cust_idx < bank.getNumOfCustomers();
        cust_idx++ ) {
            Customer customer = bank.getCustomer(cust_idx);
            
            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());
            
            // Para cada cuenta de cada cliente
            for ( int acct_idx = 0;
            acct_idx < customer.getNumOfAccounts();
            acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";
                
                // tipo de cuenta
                if ( account instanceof SavingsAccount ) {
                    account_type = "Savings Account";
                } else if ( account instanceof CheckingAccount ) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Unknown Account Type";
                }
                
                // imprime balances
                System.out.println("    " + account_type + ": current balance is "
                        + account.getBalance());
            }
        }
    }
}
