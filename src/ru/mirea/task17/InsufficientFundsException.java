package ru.mirea.task17;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("You have insufficient funds to complete the transaction.");
    }
    
}
