package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage {

	@FindBy(xpath="//span[@class='_2yAnYN']/span")
	public static WebElement ResultHeader;
}
