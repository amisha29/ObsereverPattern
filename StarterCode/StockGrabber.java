import java.util.ArrayList;

// Uses the Subject interface to update all Observers

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		
		// Create an ArrayList to hold all observers
		
		//TODO
	}
	
	public void register(Observer newObserver) {
		
		// Adds a new observer to the ArrayList
		
		//TODO
		
	}

	public void unregister(Observer deleteObserver) {
		
		//TODO
		
	}

	public void notifyObserver() {
		
		// Cycle through all observers and notifies them of
		// price changes
		
		//TODO
	}
	
	// Change prices for all stocks and notifies observers of changes
	
	public void setIBMPrice(double newIBMPrice){
		
		//TODO
	}
	
	public void setAAPLPrice(double newAAPLPrice){
		
		//TODO
		
	}

	public void setGOOGPrice(double newGOOGPrice){
	
		//TODO
	
	}
	
}