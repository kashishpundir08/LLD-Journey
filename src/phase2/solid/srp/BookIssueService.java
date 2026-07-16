package phase2.solid.srp;


public class BookIssueService {

    private BookRepository repo;

    public BookIssueService(){}

    public BookIssueService(BookRepository repo){
        this.repo = repo;
    }

    public void issueBook(String title, String memberName){
        Book book = repo.findByTitle(title);
        if(book == null){
            System.out.println("Book not found");
            return;
        }
        if(book.getIsIssued()) {
            System.out.println("Book is not available");
        }else {
            System.out.println("Book issue successfully to " + memberName);
            book.setIssued(true);
        }
    }

    public void returnBook(String title){
        Book book = repo.findByTitle(title);
        if(book == null){
            System.out.println("Book not found");
            return;
        }
        book.setIssued(false);
        System.out.println("Book return successfully");
    }

}
