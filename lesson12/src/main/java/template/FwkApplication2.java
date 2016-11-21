package template;

abstract public class FwkApplication2 {
	private boolean run = true;
	private int counter = 0;
	
	public void run() {
		configure();
		while (run) {
			idle();
			if (counter == 10) run = false;
		    counter++;
		}
		destroy();
	}
	
	public abstract void configure();
	
	public abstract void destroy();
	
	public abstract void idle() ;
}