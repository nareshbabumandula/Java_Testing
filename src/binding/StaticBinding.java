package binding;

public class StaticBinding {
	
	
	private void Login()
	{
		System.out.println("Executing Login method...");
	}
	
	final void SearchProduct()
	{
		System.out.println("Executing SearchProduct method...");
	}
	
	static void AddToCart()
	{
		System.out.println("Executing AddToCart method...");
	}
	
	public static void main(String[] args) {
		StaticBinding sb = new StaticBinding();
		sb.Login();
		sb.SearchProduct();
		AddToCart();

	}

}
