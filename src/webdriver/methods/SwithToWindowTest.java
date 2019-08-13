package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SwithToWindowTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void SwitchToWindowMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement btnHomeLoans = driver.findElement(By.xpath("//img[@src='/assets/images/Slug_banner_home_loan_new.gif']"));
			driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
			String firstSessionID = driver.getWindowHandle();
			System.out.println(driver.getWindowHandle());
			btnHomeLoans.click();
			System.out.println(driver.getWindowHandles());
			Set<String> sessions = driver.getWindowHandles();
			
			// Iterate over collection
			for (Iterator iterator = sessions.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
				if (! string.contains(firstSessionID)) {
					driver.switchTo().window(string); // Switch to window
					driver.findElement(By.name("txtName")).sendKeys("Naresh");
					Thread.sleep(2000);
				}
			}
			
			driver.switchTo().window(firstSessionID);
			driver.findElement(By.xpath("//input[@class='searchbox']")).sendKeys("Personal Loans");
			Thread.sleep(2000);
			
			
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String currentWindowHandle : allWindowHandles) {
				if (!currentWindowHandle.equals(firstSessionID)) {
					driver.switchTo().window(currentWindowHandle);
					driver.close();
				}
			}
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed actions on multiple windows");
			}
			else
			{
				System.out.println("Failed to perform actions on multiple windows");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
