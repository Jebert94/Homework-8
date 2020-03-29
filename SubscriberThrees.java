
public class SubscriberThrees implements IObserver {
	

	private PublisherImplementation pub;
	private int threeCount;
	
	public SubscriberThrees(PublisherImplementation pub) {
		this.pub = pub;
	}
	
	@Override
	public void updateObserver(Event e) {
		if(e.getEventData() % 3 == 0) {
			System.out.println("Event "+ e.getEventNumber() + " is divisible by three: " + e.getEventData());
			threeCount++;
			if(threeCount > 12) {
				unregisterMe(pub);
			}
		}

	}

	@Override
	public void unregisterMe(PublisherImplementation pub) {
		pub.removeObserver(this);

	}

}
