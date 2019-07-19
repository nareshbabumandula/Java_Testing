package debugging;

import java.util.Scanner;

public class ScannerTest {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	//Behavior
	public void Addition()
	{
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void Substraction()
	{
		int c =a-b;
		System.out.println("Substraction of a and b is : " + c);
	}
	
	public void Multiplication()
	{
		int c =a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	public void Division()
	{
		int c =b/a;
		System.out.println("Division of a and b is : " + c);
	}
	
	public void Modulus()
	{
		int c =b%a;
		System.out.println("Modulus of a and b is : " + c);
	}
	
	
	
	public static void main(String[] args) {
		ScannerTest  st = new ScannerTest();
		st.Addition();
		st.Substraction();
		st.Multiplication();
		st.Division();
		st.Modulus();

	}

}
