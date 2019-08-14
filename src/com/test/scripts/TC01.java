package com.test.scripts;

import org.testng.annotations.Test;

import com.object.repository.Homepage;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC01 extends Homepage
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void TextboxMethods()
	{
		
		boolean bFlag=false;
		
		try {
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella"); // without POM
			driver.findElement(txtSearch).sendKeys("iphone"); // with POM
			
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			if (bFlag) {
				System.out.println("Successfully enetered data in a textbox");
			} else {
				System.out.println("Failed to enter data in a text box");
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
