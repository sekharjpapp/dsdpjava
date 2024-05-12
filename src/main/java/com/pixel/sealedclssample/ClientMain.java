package com.pixel.sealedclssample;

public class ClientMain {
    public static void main(String[] args) {
        String accountNumber = "123456789";

        // Sample deposits
        Deposit cashDeposit = new CashDeposit(100.0);
        Deposit checkDeposit = new CheckDeposit(200.0, "12345");
        Deposit transferDeposit = new TransferDeposit(300.0, "987654321");

        // Process deposits
        Bank.processDeposit(accountNumber, cashDeposit);
        Bank.processDeposit(accountNumber, checkDeposit);
        Bank.processDeposit(accountNumber, transferDeposit);
    }
}
