package com.pixel.sealedclssample;

public final class CheckDeposit extends Deposit {
    private final String checkNumber;

    public CheckDeposit(double amount, String checkNumber) {
        super(amount);
        this.checkNumber = checkNumber;
    }

    @Override
    public void process(String accountNumber) {
        System.out.println("Processing check deposit of $" + getAmount() + " from check number " + checkNumber + " to account " + accountNumber);
        // Perform necessary actions for check deposit
    }
}
