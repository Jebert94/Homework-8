import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PublisherImplementationRegisterObserver {

	@Test
	void test() {
		PublisherImplementation test = new PublisherImplementation();
		ArrayList<IObserver> subscribers = new ArrayList<IObserver>();
		SubscriberOdds odds = new SubscriberOdds(test);
		test.registerObserver(odds);
		assertEquals(odds, subscribers);
	}

}
