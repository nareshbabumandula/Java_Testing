package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class RadioButtonTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void RadioButtonMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement rbtnRoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
			System.out.println(rbtnRoundTrip.getAttribute("ID"));
			System.out.println(rbtnRoundTrip.getAttribute("TYPE"));
			System.out.println(rbtnRoundTrip.getAttribute("NAME"));
			System.out.println(rbtnRoundTrip.getAttribute("VALUE"));

			//Common methods
			System.out.println(rbtnRoundTrip.isDisplayed());
			System.out.println(rbtnRoundTrip.isEnabled());
			System.out.println("Selection status of roundtrip radio button before clicking is : " + rbtnRoundTrip.isSelected());
			
			//Actual method
			rbtnRoundTrip.click();
			System.out.println("Selection status of roundtrip radio button after clicking is : " + rbtnRoundTrip.isSelected());
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a radio button");
			} else {
				System.out.println("Failed to perform actions on a radio button");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
