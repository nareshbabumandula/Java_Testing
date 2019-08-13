package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MouseOverTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void MouseoverMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement lnkAddOn = driver.findElement(By.linkText("ADD-ONS"));
	
			System.out.println(lnkAddOn.getAttribute("id"));
			System.out.println(lnkAddOn.getAttribute("href"));
			System.out.println(lnkAddOn.getAttribute("id"));

			//Common methods
			System.out.println(lnkAddOn.isDisplayed());
			System.out.println(lnkAddOn.isEnabled());

			
			//Actual method
			Actions menu = new Actions(driver);
			menu.moveToElement(lnkAddOn).perform(); // Hover the mouse on ADD-ONS link
			Thread.sleep(2000); // Hardcoding the wait statement
			driver.findElement(By.linkText("Hot Meals")).click();
							
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a menu");
			} else {
				System.out.println("Failed to perform actions on a menu");
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
