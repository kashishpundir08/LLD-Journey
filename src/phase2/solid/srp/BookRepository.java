package phase2.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getAllBooks(){
        return books;

    }

    public Book findByTitle(String title){
        for(Book book: books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }


}
