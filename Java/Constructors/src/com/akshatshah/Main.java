package com.akshatshah;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "087-494-3409");
        bobsAccount.withdrawMoney(100);

        bobsAccount.depositFunds(50);
        bobsAccount.withdrawMoney(100);

        bobsAccount.depositFunds(51);
        bobsAccount.withdrawMoney(100);
    }
}
