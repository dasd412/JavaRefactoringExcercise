package afterEnums;

public class Logger {
  
    private State _state;
    
    private enum State {

    	STATE_STOPPED{
    		@Override
    		public void start() {
    			System.out.println("** START LOGGING **");
    		}
    		public void stop() {
    			
    		}
    		public void log(String info) {
    			 System.out.println("Ignoring: " + info);
    		}
    	}
    	
    	, STATE_LOGGING{

    		@Override
    		public void start() {
    			// TODO Auto-generated method stub
    			
    		}

    		@Override
    		public void stop() {
    			// TODO Auto-generated method stub
    			System.out.println("** STOP LOGGING **");
    		}

    		@Override
    		public void log(String info) {
    			// TODO Auto-generated method stub
    			System.out.println("Logging: " + info);
    		}
    		
    	};
    	
    	public abstract void start();
    	public abstract void stop();
    	public abstract void log(String info);
    }

    
    public Logger() {
        setState(State.STATE_STOPPED);
    }
    public void start() {
    _state.start();
    setState(State.STATE_LOGGING);
    }
    public void stop() {
    _state.stop();
     setState(State.STATE_STOPPED);
    }
    public void log(String info) {
        _state.log(info);
    }
    
    public State getState() {
    	return this._state;
    }
    
    public void setState(State state) {
    this._state=state;
    }
    
}
