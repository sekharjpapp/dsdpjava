package com.pixel.sealedclssample;

public class Bank {
    public static void processDeposit(String accountNumber, Deposit deposit) {
        deposit.process(accountNumber);
    }
}
