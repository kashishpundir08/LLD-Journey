package phase1.miniproject;

import java.util.ArrayList;
import java.util.List;

public class Library{
    List<Book> books = new ArrayList();

    public List<Book> getAllBooks(){
        return books;
    }
    public List<Book> bookByTitle(String title){
        List<Book> res = new ArrayList<>();
        for(Book book : books ){
            if(book.getTitle().equals(title)){
                res.add(book);
                return res;
            }
        }
        System.out.println("This book is not available");
        return res;
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public boolean isAvailable(String title){
        for(Book book : books){
            if(book.getTitle().equals(title) && !book.isIssued()){
                return true;
            }
        }
        return false;
    }
     public void issueBook(String title, Member member){
        for(Book book : books){
            if(book.getTitle().equals(title)  && !book.isIssued()){
                book.setFlag(true);
                System.out.println("Book is issue to " + member.getMember());
                return;
            }
        }
            System.out.println("Book is not available");
     }

     public void returnBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                book.setFlag(false);
                System.out.println("Book return successfully");
                break;
            }
        }
     }


}
