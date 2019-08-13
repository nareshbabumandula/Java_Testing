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

public class DropTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void DropMethods()
	{
		boolean bFlag=false;
		
		try {
			
			driver.switchTo().frame(0);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement destination = driver.findElement(By.id("draggable"));
			Actions action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
			Thread.sleep(3000);
				
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions related to drop");
			} else {
				System.out.println("Failed to perform actions related to drop");
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
