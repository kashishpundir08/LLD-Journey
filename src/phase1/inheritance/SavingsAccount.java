package phase1.inheritance;

import phase1.classes.BankAccount;

public class SavingsAccount extends BankAccount { // inheritance
    private double interestRate; // have to define only new variable other can get from parent class

   public  SavingsAccount(){
   }

   public SavingsAccount(String owner, double balance ,double interestRate){
       super(owner, balance); // super call  that call exactly parent constructor. it should be the first line
       this.interestRate = interestRate;
   }

   public void addInterest(){
       deposit(getBalance() * interestRate /100);  // as balance is private so we are using getBalance
   }

   @Override
   public void showBalance(){
        System.out.println(getOwner() + " has left " + getBalance() + " with interest of " + interestRate + "%");
   }
}
