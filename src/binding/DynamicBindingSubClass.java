package binding;

public class DynamicBindingSubClass extends DynamicBinding{
	
	void Checkout()
	{
		System.out.println("Executing Checkout method...");
	}
	
	
	void Cancellation()
	{
		System.out.println("Executing Cancellation method...");
	}

	public static void main(String[] args) {
		
		DynamicBinding db = new DynamicBindingSubClass();
		db.Login();
		db.SearchProduct();
		db.AddToCart();
		

	}

}
