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

public class JavaScriptTest 
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
			String sDomain = js.executeScript("return document.domain;").toString();
			System.out.println("Domain = "+sDomain);
			//Fetching the URL 
			String sURL = js.executeScript("return document.URL;").toString();
			System.out.println("URL = "+sURL);
			//Fetching the Title
			String sTitle = js.executeScript("return document.title;").toString();
			System.out.println("Title = "+sTitle);
			
			// Select checkbox
			js.executeScript("document.getElementById('ctl00_mainContent_chk_StudentDiscount').checked=true;");
			Thread.sleep(2000);		
			
			WebElement btnSearch = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
			//btnSearch.click(); // Click on object using WebDriver
			
			// Highlight the webelement/object
			js.executeScript("arguments[0].style.border='2px groove green'", btnSearch);  // Highlight the object with groove green
			Thread.sleep(2000);
			
			//Click on Search button
			js.executeScript("arguments[0].click();", btnSearch); // Click on object using Javascriptexecutor
			Thread.sleep(2000);
			
			// Click on a link using JavaScriptExecutor
			js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Corporate Overview")));
			
			
			//Vertical scroll - down by 200  pixels
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(4000);
			System.out.println("Successfully did the vertical scroll by 500px");
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a browser using javascriptexecutor");
			} else {
				System.out.println("Failed to perform actions on a browser using javascriptexecutor");
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
