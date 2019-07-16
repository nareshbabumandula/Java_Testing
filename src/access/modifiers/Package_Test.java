package access.modifiers;

public class Package_Test {
	
	String URL = "http://www.eyeglassworld.com";
	String USERNAME =  "sjoerd jager";
	String PASSWORD = "Secure*1234";
	
	void AccessSite()
	{
		System.out.println("Executing default AccessSite method...");
	}
	
	void Login()
	{
		System.out.println("Executing default Login method...");
	}

	void SearchProduct()
	{
		System.out.println("Executing default SearchProduct method...");
	}
	
	void Logout()
	{
		System.out.println("Executing default Logout method...");
	}
	
	public static void main(String[] args) {
		Package_Test pt = new Package_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
