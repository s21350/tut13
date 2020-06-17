package com.company;

public abstract class AccountOperations {
    abstract double checkBalance();
    abstract void makeTransfer(double amount, BankAccount to) throws AccountOperationsException;
    abstract void makePayment(double amount) throws AccountOperationsException;

}
