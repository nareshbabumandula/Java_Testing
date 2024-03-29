package testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BeforeAfterMethod {

	@BeforeClass()
	public void Login() 
	{
		System.out.println("Executing Login method...");
	}

	@BeforeTest()
	public void LaunchBrowser() 
	{
		System.out.println("Executing Launch Browser method...");
	}

	@AfterMethod
	public void verifyPrice() 
	{
		System.out.println("Executing verifyPrice method...");
	}



	@BeforeMethod
	public void verifyUserLogin() 
	{
		System.out.println("Executing verifyUserLogin method...");
	}

	@Test
	public void SearchProduct() 
	{
		System.out.println("Executing SearchProduct method...");
		Reporter.log("Successfully searched the product");
	}

	@Test(dependsOnMethods= {"AddToCart"})
	public void Checkout() 
	{
		System.out.println("Executing Checkout method...");
		Reporter.log("Successfully checked out the product");
	}

	@Test(dependsOnMethods= {"SearchProduct"})
	public void AddToCart() 
	{
		System.out.println("Executing AddToCart method...");
		Reporter.log("Successfully added the product to the cart");
	}

	@AfterTest()
	public void CloseBrowser() 
	{
		System.out.println("Executing Close Browser method...");
	}

	@AfterClass
	public void Logout()
	{
		System.out.println("Executing Logout method...");
	}

}
