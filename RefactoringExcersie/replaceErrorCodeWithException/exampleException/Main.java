package exampleException;

public class Main {
    public static void main(String[] args) {
        Something something = new Something();
        
        try {
        	something.method1();
        	something.method2();
        	something.method3();
        }catch(AboutSomethingException e) {
        	System.err.println(e.getMessage());
        }
    
    }
}
