package ru.mirea.task17;

class InvalidAmountException extends Exception {

    public InvalidAmountException() {
        super("Invalid amount for transaction.");
    }
    
}
