package com.test.scripts;

import org.testng.annotations.Test;

import com.object.repository.Homepage;
import com.object.repository.Loginpage;
import com.object.repository.Searchpage;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TC01 extends Homepage
{

	Loginpage lp = new Loginpage();
	Searchpage sp = new Searchpage();

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void testTC01(String strProductName)
	{

		boolean bFlag=false;

		try {

			driver.findElement(lp.LoginSignup).sendKeys(Keys.ESCAPE);
			boolean blnLoginSignup = driver.findElement(lp.LoginSignup).isDisplayed();
			if (blnLoginSignup) {
				Reporter.log("Login & Signup link is displayed");
			}

			driver.findElement(txtSearch).sendKeys(strProductName);
			String strValue = driver.findElement(txtSearch).getAttribute("value");
			if (strValue.contains(strProductName)) {
				System.out.println("Successfully entered the product name " +strProductName+ " in the search textbox");
			} else {
				System.out.println("Failed to enter the product name " +strProductName+ "  in the search textbox");
			}
			driver.findElement(btnSubmit).click();

			String strProduct = driver.findElement(sp.ResultHeader).getText();

			if (strProduct.contains(strProductName)) {
				System.out.println("Product name - " +strProductName+ " is displayed in Search results page header");
			} else {
				System.out.println("Product name - "+strProductName+ " is not displayed in Search results page header");
			}


			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully searched the product - " +strProductName);
			} else {
				System.out.println("Failed to search the product - " +strProductName);
			}
		}
	}


	@BeforeClass
	public void AccessSite() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		testTC01("umbrella");
	}


	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit();
	}

}
