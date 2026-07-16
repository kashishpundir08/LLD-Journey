package phase2.solid.srp;

public class Main {
    public static void main(String[] args) {
        BookRepository br = new BookRepository();
        BookIssueService bs = new BookIssueService(br);
        Book b1 = new Book("Krishna", "Bhagvat gita");
        Book b2 = new Book("Valmiki", "Ramayan");
        br.addBook(b1);
        br.addBook(b2);
        bs.issueBook(b1.getTitle(), "Arjun");
        bs.issueBook(b1.getTitle(), "Kashish");
        bs.returnBook(b1.getTitle());
        bs.issueBook(b1.getTitle(), "Madhav");
        for(Book book: br.books){
            System.out.println(book.getAuthor() + " has written "+ book.getTitle());
        }
    }
}
