import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class PublisherImplementation implements IPublisher {
	
	private ArrayList<IObserver> subscribers = new ArrayList<IObserver>();
	private ArrayList<IObserver> unSubscribed = new ArrayList<IObserver>();
	private ArrayList<IObserver> reAdd = new ArrayList<IObserver>();
 	private ArrayList<IObserver> notifyList = new ArrayList<IObserver>();
	private final ArrayList<Integer> check = new ArrayList<>(Arrays.asList(40,60,80,120,200));

	
	public void registerObserver(IObserver o) {
		
		subscribers.add(o);
		System.out.println("Subscriber " + o + " was ADDED." );
		if(unSubscribed.contains(o)) {
			unSubscribed.remove(o);
		}
	}
	
	public void removeObserver(IObserver o) {
		subscribers.remove(o);
		System.out.println("Subscriber " + "'" + o + "'" + " was REMOVED." );
		unSubscribed.add(o);
	}
	
	public void notifyObservers(Event e) {
				
		for (int i = 0; i < subscribers.size(); i++) {
			notifyList.add(subscribers.get(i));
			
		}
		
		for (int j = 0; j < notifyList.size(); j++) {
		notifyList.get(j).updateObserver(e);
		}
		
		notifyList.clear();
	}
	
	 public Event generateEvent(int iteration) {
		 Random r = new Random(); 
		 int randomNum = r.nextInt(5000);
		 Event e = new Event(iteration,randomNum);
		 return e;
	 }
	
	 public void runSimulation() 
	 {
		for (int iteration = 1; iteration <= 200; iteration++) 
		{
			Event e = generateEvent(iteration);
			if(check.contains(iteration))
			{	
				System.out.println("checking for iteration " + iteration);
				for(IObserver o : unSubscribed){
					reAdd.add(o);
				}
					
				for(IObserver i : reAdd) {
					registerObserver(i);
				}
				
				reAdd.clear();
			}
		notifyObservers(e);

		}



		
		
		
	 }
}
