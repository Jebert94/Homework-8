
public class SubscriberOdds implements IObserver {
	
	private PublisherImplementation pub;
	private int evenCount = 0;
	
	public SubscriberOdds(PublisherImplementation pub) {
		this.pub = pub;
	}
	
	@Override
	public void updateObserver(Event e) {
		if(e.getEventData() % 2 != 0) {
			System.out.println("Event " + e.getEventNumber() + " is odd: " + e.getEventData());
			this.evenCount++;
			if (this.evenCount > 15) {
				unregisterMe(pub);
			}
		}

	}

	@Override
	public void unregisterMe(PublisherImplementation pub) {
		
		pub.removeObserver(this);

	}

}
