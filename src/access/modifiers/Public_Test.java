package access.modifiers;

public class Public_Test {
	
	public String URL = "http://www.eyeglassworld.com";
	public String USERNAME =  "sjoerd jager";
	public String PASSWORD = "Secure*1234";
	
	public void AccessSite()
	{
		System.out.println("Executing public AccessSite method...");
	}
	
	public void Login()
	{
		System.out.println("Executing public Login method...");
	}

	public void SearchProduct()
	{
		System.out.println("Executing public SearchProduct method...");
	}
	
	public void Logout()
	{
		System.out.println("Executing public Logout method...");
	}
	
	public static void main(String[] args) {
		Public_Test pt = new Public_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
