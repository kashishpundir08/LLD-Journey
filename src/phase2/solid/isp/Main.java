package phase2.solid.isp;

public class Main {
    public static void main(String[] args) {
        AdvancedPrinter ad = new AdvancedPrinter();
        BasicPrinter bp = new BasicPrinter();
        ad.fax();
        ad.print();
        ad.scan();
        bp.print();
    }
}
