package oops;

public class ClassB extends ClassA{
	
	public void Modulus()
	{
		int c =b%a;
		System.out.println("Modulus of a and b is : " + c);
	}

	public static void main(String[] args) {
		
		ClassB b1 = new ClassB();
		b1.Addition();
		b1.Substraction();
		b1.Multiplication();
		b1.Division();
		
		
	}

}
