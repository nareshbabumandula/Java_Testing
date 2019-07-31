package webdriver.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowserTest {
	
	
	WebDriver driver;

	/**
	 * @Method LaunchBrowserExample
	 * @Desc This method is used to launch the browser
	 * @InputParameters Browser name (e.g "ie", "ff", "chrome", "safari")
	 * @Output NA
	 * @Modified
	 * @author NareshBabu 
	 */
	public void LaunchBrowserExample(String BROWSER)
	{
		String strRootPath = System.getProperty("user.dir");
		
		switch (BROWSER.toUpperCase().trim()) {
		case "IE": case "INTERNET EXPLORER":
			System.setProperty("webdriver.ie.driver", strRootPath + "\\drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			break;
		case "FF": case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", strRootPath + "\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", strRootPath + "\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		
		driver.manage().window().maximize(); // maximize the browser window
		driver.get("https://www.hdfcbank.com/"); // access website
		System.out.println(driver.getTitle()); // browser tab title
		System.out.println(driver.getCurrentUrl()); // Current URL
		System.out.println(driver.getWindowHandle());  // browser session id
		driver.quit();
	}



	public static void main(String[] args) {
		LaunchBrowserTest lbt = new LaunchBrowserTest();
		lbt.LaunchBrowserExample("CHROME");

	}

}
