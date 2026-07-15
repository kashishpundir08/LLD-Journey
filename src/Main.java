import phase1.abstraction.Circle;
import phase1.abstraction.Rectangle;
import phase1.abstraction.Square;
import phase1.classes.BankAccount;
import phase1.inheritance.SavingsAccount;
import phase1.miniproject.Book;
import phase1.miniproject.Library;
import phase1.miniproject.Member;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        BankAccount ac = new BankAccount("Krishna", 1200);
//        ac.deposit(2000);
//        ac.showBalance();
//    //  ac.balance =  -999999; // anyone can set value if balace have public access so we will use encapsulation by making them private and public getter and setter method to access them.
//
//        System.out.println(ac.getBalance());
//        System.out.println(ac.getOwner());
//        ac.showBalance();
//
//        ac.setBalance(908765);
//        ac.setOwner("Radha");
//        ac.showBalance();
//
//        SavingsAccount sa  = new SavingsAccount("Madhav", 10000, 20);
//        sa.addInterest();
//        sa.showBalance();
//
//        BankAccount ba = new SavingsAccount("Shri", 500000, 10);
//         ba.showBalance();
//        ba.deposit(9000, "Krishna set this");
//        ba.showBalance();

        // Abstraction
//        Shape s = new Shape(); // we can't make object of abstract class it will throw CTE

//        Circle c = new Circle(7);
//        c.describe();
//        c.area();
//        Rectangle r = new Rectangle(8, 9);
//        r.describe();
//        r.area();
//        c.print();
//        Square s = new Square(8);
//        s.area();
//        s.describe();

        // mini library system
        Book b1 = new Book("Krishna", "Bhagvad geeta");
        Book b2 = new Book("Valmiki", "Ramayan");
        Library l = new Library();
        Member m1 = new Member("Shri", 1);
        Member m2 = new Member("Madhav", 2);


        // adding book
        l.addBooks(b1);
        l.addBooks(b2);
        //checking book b1 available or not --- true
        System.out.println(l.isAvailable(b1.getTitle()));
        // issue b1 to m1 --- Book is issue to Shri
        l.issueBook(b1.getTitle(), m1);
        // checking availability of b1 --- false
        System.out.println(l.isAvailable(b1.getTitle()));
        // issue again b1 to m2 but now  --- book is not available
        l.issueBook(b1.getTitle(), m2);
        // returning b1 -- Book return successfully
        l.returnBook(b1.getTitle());
        // checking availability of b1 again -- true
        System.out.println(l.isAvailable(b1.getTitle()));

        // printing all book Krishna written Bhagvad geet, Valmiki written Ramayan
        for(Book book : l.getAllBooks()){
            System.out.println(book.getAuthor() + " written " + book.getTitle());
        }
    }
}