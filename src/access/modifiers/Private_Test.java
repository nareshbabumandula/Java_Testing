package access.modifiers;

public class Private_Test {
	
	private String URL = "http://www.eyeglassworld.com";
	private String USERNAME =  "sjoerd jager";
	private String PASSWORD = "Secure*1234";
	
	private void AccessSite()
	{
		System.out.println("Executing private AccessSite method...");
	}
	
	private void Login()
	{
		System.out.println("Executing private Login method...");
	}

	private void SearchProduct()
	{
		System.out.println("Executing private SearchProduct method...");
	}
	
	private void Logout()
	{
		System.out.println("Executing private Logout method...");
	}
	
	public static void main(String[] args) {
		Private_Test pt = new Private_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
