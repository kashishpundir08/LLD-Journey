package phase1.classes;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(){
    }

     public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance =  this.balance + amount;
    }

    public double getBalance(){  // encapsulation
        return  this.balance;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String name){
        this.owner = name;
    }

    public  void setBalance(double balance){
        if(balance<0){
            System.out.println("Invalid amount");
        }else{
            this.balance = balance;
        }
    }
    public void showBalance(){
        System.out.println( this.owner + " has Rs. " + balance + " in their ac");
    }

    // polymorphism
    public  void deposit(double amount, String note){
        System.out.println(note);
        this.deposit(amount);
    }
}
