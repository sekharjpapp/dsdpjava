package com.pixel.sealedclssample;

public final class TransferDeposit extends Deposit {
    private final String fromAccount;

    public TransferDeposit(double amount, String fromAccount) {
        super(amount);
        this.fromAccount = fromAccount;
    }

    @Override
    public void process(String accountNumber) {
        System.out.println("Processing transfer deposit of $" + getAmount() + " from account " + fromAccount + " to account " + accountNumber);
        // Perform necessary actions for transfer deposit
    }
}
