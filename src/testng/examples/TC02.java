package testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TC02 extends TC01{

	@BeforeClass(groups= {"smoke", "regression"})
	public void Login() 
	{
		System.out.println("Executing Login method...");
	}

	@BeforeTest(groups= {"prerequisite"})
	public void LaunchBrowser() 
	{
		System.out.println("Executing Launch Browser method...");
	}

	@AfterMethod(groups= {"regression"})
	public void verifyPrice() 
	{
		System.out.println("Executing verifyPrice method...");
	}


	@BeforeMethod(groups= {"smoke", "regression"})
	public void verifyUserLogin() 
	{
		System.out.println("Executing verifyUserLogin method...");
	}

	@Test(groups= {"smoke", "regression"})
	public void SearchProduct() 
	{
		System.out.println("Executing SearchProduct method...");
		Reporter.log("Successfully searched the product");
	}

	@Test(dependsOnMethods= {"AddToCart"}, groups= {"regression"})
	public void Checkout() 
	{
		System.out.println("Executing Checkout method...");
		Reporter.log("Successfully checked out the product");
	}

	@Test(dependsOnMethods= {"SearchProduct"}, groups= {"regression"})
	public void AddToCart() 
	{
		System.out.println("Executing AddToCart method...");
		Reporter.log("Successfully added the product to the cart");
	}

	@AfterTest(groups= {"feature"})
	public void CloseBrowser() 
	{
		System.out.println("Executing Close Browser method...");
	}

	@AfterClass(groups= {"smoke", "regression"})
	public void Logout()
	{
		System.out.println("Executing Logout method...");
	}

}
