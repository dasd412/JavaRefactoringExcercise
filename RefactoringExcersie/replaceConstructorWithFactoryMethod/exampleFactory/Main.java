package exampleFactory;
public class Main {
    public static void main(String[] args) {
        new Client(Printer.getDigitalPrinter()).execute();
        new Client(Printer.getGraphPrinter()).execute();
    }
}
