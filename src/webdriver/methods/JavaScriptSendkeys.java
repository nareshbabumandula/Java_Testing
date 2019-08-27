package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavaScriptSendkeys 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void JavaScriptBrowserMethods()
	{
		boolean bFlag=false;

		try {
			//Creating the Javascriptexecutor interface object by Type casting
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementsByName('userName')[0].value='naresh223';");
			js.executeScript("history.go(0)"); //Refresh the page using JavascriptExecutor
			Thread.sleep(4000);
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully entered value in a textbox using javascriptexecutor");
			} else {
				System.out.println("Failed to enter value in a textbox using javascriptexecutor");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
