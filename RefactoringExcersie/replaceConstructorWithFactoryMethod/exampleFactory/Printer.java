package exampleFactory;
public abstract class Printer {
    public abstract void println(int n);
    
    public static Printer getDigitalPrinter() {
    	return new DigitPrinter();
    }
    
    public static Printer getGraphPrinter() {
    	return new GraphPrinter();
    }
}
