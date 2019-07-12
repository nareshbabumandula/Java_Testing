package oops;

public class IMAX extends Theater{

	public static void main(String[] args) {
		IMAX im = new IMAX();
		im.TicketBooking();
		im.TicketCancellation();
		im.Cafteria();
		im.CarParking();
		im.FireAndSafety();
		im.BikeParking();
		im.OnlineBooking();
		im.VIPLounge();

	}

	@Override
	void TicketCancellation() {
		System.out.println("Ticket Cancellation is allowed");
		
	}

	@Override
	void TicketBooking() {
		System.out.println("Ticket Booking is available at counters");
		
	}

	@Override
	void CarParking() {
		System.out.println("Car parking is availbel for max of 100 cars");
		
	}

	@Override
	void BikeParking() {
		System.out.println("Bike parking is available to park 300 bikes");
		
	}

	@Override
	void FireAndSafety() {
		System.out.println("Fire and safety if taken care");
		
	}

	@Override
	void Cafteria() {
		System.out.println("Cafeteria is availble");
		
	}

}
