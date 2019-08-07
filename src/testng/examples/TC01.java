package testng.examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TC01 {

	@BeforeSuite(groups= {"feature"})
	public void KillBrowsers()
	{
		System.out.println("Executing KillBrowsers method...");
	}
	
	
	
	@AfterSuite(groups= {"feature"})
	public void SendEmail()
	{
		System.out.println("Executing SendEmail method...");
	}

}
