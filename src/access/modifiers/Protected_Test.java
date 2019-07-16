package access.modifiers;

public class Protected_Test {
	
	protected String URL = "http://www.eyeglassworld.com";
	protected String USERNAME =  "sjoerd jager";
	protected String PASSWORD = "Secure*1234";
	
	protected void AccessSite()
	{
		System.out.println("Executing protected AccessSite method...");
	}
	
	protected void Login()
	{
		System.out.println("Executing protected Login method...");
	}

	protected void SearchProduct()
	{
		System.out.println("Executing protected SearchProduct method...");
	}
	
	protected void Logout()
	{
		System.out.println("Executing protected Logout method...");
	}
	
	public static void main(String[] args) {
		Protected_Test pt = new Protected_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
