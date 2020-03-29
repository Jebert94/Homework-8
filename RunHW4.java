
public class RunHW4 {

	public static void main(String[] args) {
		PublisherImplementation pub = new PublisherImplementation();
		
		SubscriberOdds odd = new SubscriberOdds(pub);
		SubscriberEvens even = new SubscriberEvens(pub);
		SubscriberThrees three = new SubscriberThrees(pub);
		
		pub.registerObserver(odd);
		pub.registerObserver(even);
		pub.registerObserver(three);
		
		pub.runSimulation();
	}

}
