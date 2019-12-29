package SimpleDatabaseAfter1;

import java.io.*;
import java.util.*;

public class SimpleDatabase {
    private Map<String,String> _map = new HashMap<String,String>();
    public SimpleDatabase(Reader inputReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(inputReader);

        String line;
        while (true) {
        	line = bufferedReader.readLine();
            if (line == null) {
            	break;
            } 
            
            int equalIndex=line.indexOf("=");
            if(equalIndex>0) {
            	String key=line.substring(0,equalIndex);
            	String value=line.substring(equalIndex+1,line.length());
            	_map.put(key, value);
            }
            
            
        }
    }
    public void putValue(String key, String value) {
        _map.put(key, value);
    }
    public String getValue(String key) {
        return _map.get(key);
    }
    public Iterator<String> iterator() {
        return _map.keySet().iterator();
    }
}
