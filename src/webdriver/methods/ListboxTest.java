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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class ListboxTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void ListboxMethods()
	{
		boolean bFlag=false;
		
		try {
			WebElement lstCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
			System.out.println(lstCurrency.getAttribute("name"));
			System.out.println(lstCurrency.getAttribute("class"));
			System.out.println(lstCurrency.getAttribute("id"));

			//Common methods
			System.out.println(lstCurrency.isDisplayed());
			System.out.println(lstCurrency.isEnabled());
			System.out.println(lstCurrency.isSelected());
			
			//Actual method
			Select list = new Select(lstCurrency);
			list.selectByIndex(0); // Selects the first value from the dropdown
			Thread.sleep(2000);
			list.selectByVisibleText("USD");
			System.out.println(list.getOptions()); // Print all options from the dropdown
			List<WebElement> lstCurrencies = list.getOptions();
			System.out.println(lstCurrencies.size()); // No of the elements stored in the list
					
			for (WebElement currency : lstCurrencies) {
				System.out.println(currency.getText());
			}
				
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on a listbox");
			} else {
				System.out.println("Failed to perform actions on a listbox");
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
