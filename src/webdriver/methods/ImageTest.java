package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ImageTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void ImageMethods()
	{

		boolean bFlag=false;

		try {
			WebElement imgLogo = driver.findElement(By.cssSelector("a[class='spicejet_logo']"));
			System.out.println(imgLogo.getAttribute("class"));
			System.out.println(imgLogo.getAttribute("href"));
			System.out.println(imgLogo.getAttribute("title"));

			//Common methods
			System.out.println(imgLogo.isDisplayed());
			System.out.println(imgLogo.isEnabled());
			
			//Actual method
			imgLogo.click();
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the actions on an image");
			} else {
				System.out.println("Failed to perform actions on an image");
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
