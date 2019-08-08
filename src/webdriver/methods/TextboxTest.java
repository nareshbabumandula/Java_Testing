package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TextboxTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void TextboxMethods()
	{
		
		boolean bFlag=false;
		
		try {
			WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
			System.out.println(txtSearch.getAttribute("type"));
			System.out.println(txtSearch.getAttribute("id"));
			System.out.println(txtSearch.getAttribute("name"));
			System.out.println(txtSearch.getAttribute("autocomplete"));
			System.out.println(txtSearch.getAttribute("class"));
			System.out.println(txtSearch.getAttribute("dir"));
			System.out.println(txtSearch.getAttribute("tabindex"));

			//Common methods
			System.out.println(txtSearch.isDisplayed());
			System.out.println(txtSearch.isEnabled());

			//Actual method
			txtSearch.sendKeys("dell");
			Thread.sleep(2000);
			txtSearch.clear();
			Thread.sleep(2000);
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a textbox");
			} else {
				System.out.println("Failed to perform actions on a textbox");
			}
		}


	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
