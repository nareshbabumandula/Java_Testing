package pagefactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{

	@FindBy(linkText="Login & Signup")
	public static WebElement LoginSignup;
	
	@FindBy(how=How.LINK_TEXT,using="Login & Signup")
	@CacheLookup
	static WebElement LoginSignup1;
	
	@FindBy(how=How.XPATH,using="//a[@href='account/login?ret=/']")
	@CacheLookup
	WebElement LoginSignup2;
	
	public void SignUp()
	{
		//LoginSignup.click();
	}
	
}