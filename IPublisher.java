
public interface IPublisher {
	
	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers(Event e);
}
