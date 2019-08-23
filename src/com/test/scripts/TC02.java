package com.test.scripts;

import org.testng.annotations.Test;

import com.object.repository.Homepage;
import com.object.repository.Loginpage;
import com.object.repository.Searchpage;

import pagefactory.LoginPage;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TC02 extends Homepage
{
	
	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	
	@Test
	public void testTC01(String strProductName)
	{
		pagefactory.Homepage home =  PageFactory.initElements(driver, pagefactory.Homepage.class);
		pagefactory.Searchpage sp = PageFactory.initElements(driver, pagefactory.Searchpage.class);
		pagefactory.LoginPage lp = PageFactory.initElements(driver, pagefactory.LoginPage.class);
		
		boolean bFlag=false;
		try {
			lp.LoginSignup.sendKeys(Keys.ESCAPE);		
			home.searchProduct();
			
			String strProduct = sp.ResultHeader.getText();

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
