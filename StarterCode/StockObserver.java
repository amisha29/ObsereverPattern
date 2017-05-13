// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	// Static used as a counter
	
	private static int observerIDTracker = 0;
	
	// Used to track the observers
	
	private int observerID;
	
	// Will hold reference to the StockGrabber object
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		
	//TODO
		
	}
	
	// Called to update all observers
	
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		
	//TODO
		
	}
	
	public void printThePrices(){
		
	//TODO
		
	}
	
}