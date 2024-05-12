package com.pixel.sealedclssample;

public final  class CashDeposit extends Deposit{
    public CashDeposit(double amount) {
        super(amount);
    }

    @Override
    public void process(String accountNumber) {
        System.out.println("Processing cash deposit of $" + getAmount() + " to account " + accountNumber);
        // Perform necessary actions for cash deposit
    }
}
