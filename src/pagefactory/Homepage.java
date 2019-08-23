package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	
	@FindBy(name="q")
	static WebElement txtSearch;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	static WebElement btnSubmit;
	
	
	public void searchProduct()
	{
		txtSearch.sendKeys("Umbrella");
		btnSubmit.click();
	}
	
}
