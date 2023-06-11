package com.bytebank;

public class MainAccount {

    public static void main(String[] args) {

        Account accountOne = new Account();
        Account accountTwo = new Account();

        setPersonAccount(accountOne, "Leonel");

        setPersonAccount(accountTwo, "Solange");


        // Deposit to
        deposit(accountOne, 500);
        deposit(accountTwo, 1500);

        // Transfer to
        transfer(accountTwo,accountOne, 1000);

    }

    private static void setPersonAccount(Account account, String value){
        account.setHeadline(value);
    }

    private static void deposit(Account account, double value) {
        account.deposit(value);
        System.out.println("Se ah depositado: " + value + " en su cuenta");
    }

    private static void transfer(Account accountThatTransfer, Account accountToTransfer, double value){
        accountThatTransfer.transfer(value, accountToTransfer);
        showBalanceAccount(accountThatTransfer);
    }

    private static void showBalanceAccount(Account account){
        System.out.println("Transferencia exitosa, el saldo de tu cuenta ahora es de: " + account.getBalance());
    }
}
