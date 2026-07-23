package phase3.patterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;


    private DatabaseConnection(){
        this.url = "dbc:mysql://localhost/mydb";
        System.out.println("DB connection created");
    }
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public String getUrl(){
        return this.url;
    }


}
