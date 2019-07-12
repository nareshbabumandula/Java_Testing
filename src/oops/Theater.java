package oops;

public abstract class Theater {
	
	
	abstract void TicketCancellation();
	abstract void TicketBooking();
	abstract void CarParking();
	abstract void BikeParking();
	abstract void FireAndSafety();
	abstract void Cafteria();
	
	public void OnlineBooking()
	{
		System.out.println("Executing OnlineBooking method...");
	}
	
	public void VIPLounge()
	{
		System.out.println("Executing VIPLounge method...");
	}
	
	

	public static void main(String[] args) {
		

	}

}
