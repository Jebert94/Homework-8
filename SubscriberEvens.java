
public class SubscriberEvens implements IObserver {

	private PublisherImplementation pub;
	
	public SubscriberEvens(PublisherImplementation pub) {
		this.pub = pub;
	}
	
	@Override
	public void updateObserver(Event e) {
		if(e.getEventData() % 2 == 0) {
			System.out.println("Event " + e.getEventNumber() + " is even : " + e.getEventData());
		}

	}

	@Override
	public void unregisterMe(PublisherImplementation pub) {
		pub.removeObserver(this);
	}

}
