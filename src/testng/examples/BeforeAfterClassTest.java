package testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeAfterClassTest {
 
  @BeforeClass()
  public void Login() 
  {
	  System.out.println("Executing Login method...");
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
    

  @AfterClass()
  public void Logout()
  {
	  System.out.println("Executing Logout method...");
  }

}
