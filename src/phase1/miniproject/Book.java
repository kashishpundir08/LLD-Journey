package phase1.miniproject;

public class Book {
    private String author;
    private String title;
    private boolean flag = false;

    public Book(){
    }

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public boolean isIssued(){
        return flag;
    }
    public void setFlag(boolean value){
        this.flag = value;
    }
}
