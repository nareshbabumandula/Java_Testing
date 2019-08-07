package testng.examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC03 extends TC02{

	@BeforeTest(groups= {"feature"})
	public void LaunchBrowser() 
	{
		System.out.println("Executing Launch Browser method...");
	}
	
	@AfterTest(groups= {"feature"})
	public void CloseBrowser() 
	{
		System.out.println("Executing Close Browser method...");
	}
	
	
	

}
