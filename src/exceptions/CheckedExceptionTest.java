package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTest {


	public void CheckedExceptionThrowsExample() throws FileNotFoundException
	{
		FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Documents\\Java_Testing\\files\\Data.txt");
	}
	
	public void CheckedExceptionTryCatchExample()
	{
		try {
			FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Documents\\Java_Testing\\files\\Data123.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	public void CheckedExceptionTryCatchFinallyExample()
	{
		boolean bFlag=false;
		
		try 
		{
			FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Documents\\Java_Testing\\files\\Data123.txt");
			bFlag=true;
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally {
			if (bFlag==true) {
				System.out.println("File path is correct");
			} else {
				System.out.println("File path is not valid");
			}
		}
	}
	
	

	public static void main(String[] args) throws FileNotFoundException {

		CheckedExceptionTest checked = new CheckedExceptionTest();
		//checked.CheckedExceptionThrowsExample();
		//checked.CheckedExceptionTryCatchExample();
		checked.CheckedExceptionTryCatchFinallyExample();
		
	}

}
