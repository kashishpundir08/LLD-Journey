package phase3.patterns.singleton;

public class Main {
    public static void main(String[] args) {
    DatabaseConnection c1 = DatabaseConnection.getInstance();
    DatabaseConnection c2 = DatabaseConnection.getInstance();
    DatabaseConnection c3 = DatabaseConnection.getInstance();
    DatabaseConnection c4 = DatabaseConnection.getInstance();
    System.out.println(c1.getUrl());
    System.out.println(c2.getUrl());
    System.out.println(c1==c4);
    }
}
