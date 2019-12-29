package exampleException;

public class Something {
  
    public boolean method1() throws AboutSomethingException{
        // ...
        return true;
    }
    public boolean method2() throws AboutSomethingException{
        // ...
        return true;
    }
    public boolean method3() throws AboutSomethingException{
        // ...
    	throw new AboutSomethingException("method3: file open error.");
        
        
    }
    // ...
}
