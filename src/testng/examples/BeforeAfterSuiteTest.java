package testng.examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuiteTest {
	
	@BeforeSuite
	public void KillBrowsers()
	{
		System.out.println("Executing KillBrowsers method...");
	}
	
	
	
	@AfterSuite
	public void SendEmail()
	{
		System.out.println("Executing SendEmail method...");
	}

}
