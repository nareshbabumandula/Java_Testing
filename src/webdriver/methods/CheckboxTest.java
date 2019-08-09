package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CheckboxTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void CheckboxMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement chkFamiliyandFriends = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
			System.out.println(chkFamiliyandFriends.getAttribute("ID"));
			System.out.println(chkFamiliyandFriends.getAttribute("TYPE"));
			System.out.println(chkFamiliyandFriends.getAttribute("NAME"));

			//Common methods
			System.out.println(chkFamiliyandFriends.isDisplayed());
			System.out.println(chkFamiliyandFriends.isEnabled());
			System.out.println("Selection status family and friends checkbox before clicking is : " + chkFamiliyandFriends.isSelected());
			
			//Actual method
			chkFamiliyandFriends.click();
			System.out.println("Selection status family and friends checkbox after clicking is : " + chkFamiliyandFriends.isSelected());
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a checkbox");
			} else {
				System.out.println("Failed to perform actions on a checkbox");
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
