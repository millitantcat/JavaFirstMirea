package ru.mirea.task17;


public class Savings extends Account{
    
    Savings(int accountNumber, double initialDeposit){
        super(accountNumber);
        this.setBalance(initialDeposit);
    }
   
    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }
}
