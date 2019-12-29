package exampleFactory;
public class Client {
    private  Printer _printer;

    public Client(Printer printer) {//DI
    	this._printer=printer;
    }
    
    public void execute() {
        int[] table = { 3, 1, 4, 1, 5, 9 };
        for (int n : table) {
            _printer.println(n);
        }
    }
}
