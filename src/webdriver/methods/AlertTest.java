package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AlertTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void AlertMethods()
	{
		boolean bFlag=false;
		
		try {
			driver.findElement(By.name("submit")).click(); // Click on Submit button
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			alert.dismiss(); // Close the alert window
			Thread.sleep(1000);
			driver.findElement(By.name("submit")).click(); // Click on Submit button
			Thread.sleep(2000);
			alert.accept(); // Accept the alert by clicking on default button
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a alert popup window");
			} else {
				System.out.println("Failed to perform actions on a alert popup window");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		//driver.quit();
	}

}
