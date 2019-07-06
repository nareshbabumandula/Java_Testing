package control.statements;

public class IfTest {
	
	
	public void IfExample()
	{
		int a=100;
		int b=20;
		
		if (a>b) 
		{
			System.out.println("a is greater than b");
		}
		
	}
	
	public void IfElseExample()
	{
		int a=10;
		int b=10;
		
		if (a>b) 
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is less than b");
		}
		
	}
	
	
	public void IfElseIfElseExample()
	{
		int a=100;
		int b=10;
		
		if (a>b) 
		{
			System.out.println("a is greater than b");
		}
		else if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a is less than b");
		}
		
	}
	

	public static void main(String[] args) {
		IfTest obj = new IfTest();
		//obj.IfExample(); // Method call
		//obj.IfElseExample();
		obj.IfElseIfElseExample();
	}

}
