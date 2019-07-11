package oops;

public class MethodOverrideTest extends MethodOverloadTest{
	
	public void Addition(int a, int b)
	{
		int c =a+b;
		System.out.println("Addition of integer a and b in subclasss is : " + c);
	}
	
	
	public void Demo()
	{
		super.Addition(10, 20);
		this.Addition(40, 100);
		Addition(30,120);
		// super keyword we use to supress method overriding
	}

	public static void main(String[] args) {
		MethodOverrideTest or = new MethodOverrideTest();
		or.Demo();

	}

}
