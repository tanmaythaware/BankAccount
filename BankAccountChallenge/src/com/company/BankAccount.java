package com.company;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String name;
    private String email;
    private long phoneNumber;

    public BankAccount (){
        this(000000, 00000, "Default", "Default", 0000000000 );
        System.out.println("Constructor Called without parameters");
    }

    public BankAccount(String name, String email, long phoneNumber) {
        this(00000,000000,name,email,phoneNumber);
    }

    public BankAccount (long accountNumber, long balance, String name, String email, long phoneNumber){
        System.out.println("Constructor called with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }
    public long getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(long balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(long money){
        this.balance = this.balance + money;
        System.out.println("Updated Balance is " + this.balance);
    }
    public void withdrawMoney(long money){
        if((this.balance - money) < 0){
            System.out.println("Insufficient Balance");
        } else {
            this.balance = this.balance - money;
            System.out.println("Updated Balance is " + this.balance);
        }
    }
}
