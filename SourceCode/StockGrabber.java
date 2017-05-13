import java.util.ArrayList;

// Uses the Subject interface to update all Observers

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		
		// Creates an ArrayList to hold all observers
		
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer newObserver) {
		
		// Adds a new observer to the ArrayList
		
		observers.add(newObserver);
		
	}

	public void unregister(Observer deleteObserver) {
		
		// Get the index of the observer to delete
		
		int observerIndex = observers.indexOf(deleteObserver);
		
		// Print out message (Have to increment index to match)
		
		System.out.println("Observer " + (observerIndex+1) + " deleted\n");
		
		// Removes observer from the ArrayList
		
		observers.remove(observerIndex);
		
	}

	public void notifyObserver() {
		
		// Cycle through all observers and notifies them of
		// price changes
		for(Observer observer : observers){
			System.out.println("Notifying observer " + (observers.indexOf(observer) + 1));
			observer.update(ibmPrice, aaplPrice, googPrice);
			
		}
	}
	
	// Change prices for all stocks and notifies observers of changes
	
	public void setIBMPrice(double newIBMPrice){
		
		this.ibmPrice = newIBMPrice;
		System.out.println("IBM price changed to " + newIBMPrice + "\n");
		notifyObserver();
		
	}
	
	public void setAAPLPrice(double newAAPLPrice){
		
		this.aaplPrice = newAAPLPrice;
		System.out.println("Apple price changed to " + newAAPLPrice + "\n");
		notifyObserver();
		
	}

	public void setGOOGPrice(double newGOOGPrice){
	
		this.googPrice = newGOOGPrice;
		System.out.println("Google price changed to " + newGOOGPrice  + "\n");
		notifyObserver();
	
	}
	
}