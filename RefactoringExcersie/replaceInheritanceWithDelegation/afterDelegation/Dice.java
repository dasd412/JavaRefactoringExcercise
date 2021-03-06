package afterDelegation;
import java.util.*;

public class Dice  {
	private final Random random;
	
    public Dice() {
        
        this(314159L);
    }
    public Dice(long seed) {
      random=new Random(seed);
    }
    
    public void setSeed(long seed) {
    	random.setSeed(seed);
    }
    public int nextInt() {
        return random.nextInt(6) + 1;
    }

}
