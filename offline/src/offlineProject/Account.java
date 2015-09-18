package offlineProject;

import javax.print.DocFlavor;

/**
 * Created by Muntasir on 9/15/2015.
 */
public class Account extends Customer {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;

    public Account(Customer customer1,int accountNumber1,double balance1)
    {
        customer=customer1;
        accountNumber=accountNumber1;
        balance=balance1;
        branch="";
    }

    public Account(Customer customer1,int accountNumber1,String branch1)
    {
        customer=customer1;
        accountNumber=accountNumber1;
        branch=branch1;
        balance=0;
    }

    public void setBranch(String branch1) {
        branch = branch1;
    }

    public void setBalance(double balance1) {
        balance = balance1;
    }

    public String getCustomerName()
    {
        return customer.getName();
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void credit(double taka)
    {
        balance+=taka;
    }

    public void debit(double taka)
    {
        if(taka>balance)
        {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        else
        {
            balance-=taka;
        }
    }

    public void print()
    {
        System.out.println("Customer: "+ customer.getName() + " Branch: " + branch + " A/C no: " + accountNumber + " Balance: " + balance);
    }

    public Customer getCustomer() {
        return customer;
    }
}
