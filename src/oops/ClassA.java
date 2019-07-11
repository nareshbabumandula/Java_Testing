package oops;

public class ClassA {
	
	int a=10; // Characteristics or state or data members
	int b=20;
	String name = "hari";
	
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
	
	public ClassA() {
		System.out.println("This is a constructor of ClassA...");
	}
	
}
