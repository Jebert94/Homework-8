
public class Event {
	private int eventNumber;
	private int eventData;
	
	public int getEventData() {
		return eventData;
	}
	
	public int getEventNumber() {
		return eventNumber;
	}
	
	Event(int eventNumber,int eventData){
		this.eventData = eventData;
		this.eventNumber = eventNumber;
	}
}
