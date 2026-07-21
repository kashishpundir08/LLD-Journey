package phase2.solid.isp;

import java.net.SocketOption;

public class AdvancedPrinter implements Printable, Scannable, Faxable{
    public void print(){
        System.out.println("This is print method in  advanced printer");
    }
    public void scan(){
        System.out.println("This is scan method of advanced printer");
    }
    public void fax(){
        System.out.println("This is fax method");
    }
}
