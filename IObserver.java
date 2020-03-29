
public interface IObserver {
	void updateObserver(Event e);
	void unregisterMe(PublisherImplementation p);
}
