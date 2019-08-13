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

public class SwitchToFrameTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void FrameMethods()
	{
		boolean bFlag=false;
		
		try {
			driver.findElement(By.linkText("Autocomplete")).click(); // Before switching to the frame
			driver.switchTo().frame(0); //Switch the webdriver focus to the 1st frame in the hierarchy of the html DOM
			//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/autocomplete/default.html']")));
			driver.findElement(By.id("tags")).sendKeys("Selenium");
			Thread.sleep(2000);
			driver.switchTo().defaultContent(); // Switches the webdriver focus outside the frame
			driver.findElement(By.linkText("Draggable")).click();
			Thread.sleep(2000);
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all actions on a frame");
			} else {
				System.out.println("Failed to perform actions on a frame");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
