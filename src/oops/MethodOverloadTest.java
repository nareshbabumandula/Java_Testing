package oops;

public class MethodOverloadTest {
	
	
	public void Addition(int a, int b)
	{
		int c =a+b;
		System.out.println("Addition of integer a and b is : " + c);
	}
	
	
	public void Addition(double a, double b)
	{
		double c =a+b;
		System.out.println("Addition of double a and b is : " + c);

	}

	public static void main(String[] args) {
		MethodOverloadTest mo = new MethodOverloadTest();
		mo.Addition(10,40);

	}

}
