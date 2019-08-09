package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PartialLinkTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void LinkMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement lnkCorporateOverview = driver.findElement(By.partialLinkText("Corporate Over"));
			System.out.println(lnkCorporateOverview.getAttribute("href"));
	
			//Common methods
			System.out.println(lnkCorporateOverview.isDisplayed());
			System.out.println(lnkCorporateOverview.isEnabled());
						
			//Actual method
			lnkCorporateOverview.click();
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a link");
			} else {
				System.out.println("Failed to perform actions on a link");
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
