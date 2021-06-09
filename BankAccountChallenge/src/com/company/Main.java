package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount(1212121,10000,"TSquare", "abcd@abc.com",1234567890);
	    account.depositMoney(10000);
	    account.withdrawMoney(5000);
	    account.withdrawMoney(30000);
		System.out.println("Account Number is " + account.getAccountNumber());
		System.out.println("Name is " + account.getName());
		System.out.println("Email is " + account.getEmail());
		System.out.println("Phone Number is " + account.getPhoneNumber());
		System.out.println("Balance is " + account.getBalance());

		BankAccount account2 = new BankAccount("T2","qwerty@qwe.com",987654321);
		System.out.println("Name is " + account2.getName() + " Email is " + account2.getEmail() + " Phone No. is " + account2.getPhoneNumber());

    }
}
