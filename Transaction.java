package com.company;

public class Transaction {
    private static int COUNTER = 0;
    private double amount;
    private BankAccount sender, receiver;

    public Transaction(double amount, BankAccount sender, BankAccount reciever) {
        int transactionID = COUNTER++;
        this.amount = amount;
        this.sender = sender;
        this.receiver = reciever;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getSender() {
        return sender;
    }

    public BankAccount getReceiver() {
        return receiver;
    }

}
