package com.pixel.sealedclssample;

public sealed abstract class Deposit permits CashDeposit, CheckDeposit, TransferDeposit{
    private final double amount;

    public Deposit(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void process(String accountNumber);
}
