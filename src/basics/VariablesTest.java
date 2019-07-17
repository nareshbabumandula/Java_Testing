package basics;

public class VariablesTest {
	
	String URL = "http://www.spicejet.com"; //Class variable or Instance variable
	static String USERNAME = "naresh"; //Static variable or global variable
	
	public void Login()
	{
		String PASSWORD = "selenium123"; // Local variable
		System.out.println(PASSWORD);
		System.out.println(USERNAME);
	}
		

	public static void main(String[] args) {
		VariablesTest vt = new VariablesTest();
		System.out.println(vt.URL);
		System.out.println(USERNAME);
	}

}
