package webdriver.methods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.apache.commons.io.FileUtils;

public class TakeScreenshotTest 
{

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");


	@Test
	public void TakeScrenshotMethod()
	{
		boolean bFlag=false;
		
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("red mi phone");
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE); // Capture screenshot
			FileUtils.copyFile(source, new File(strProjectPath + "\\screenshots\\Screenshot1.png"));
			bFlag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (bFlag) {
				System.out.println("Successfully captured a screenshot");
			} else {
				System.out.println("Failed to capture a screenshot");
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
