package oops;

public class ClassC extends ClassB{
 
	int length=10;
	int breadth=20;
	int height=30;
	
	public void Volume()
	{
		int volume = length*breadth*height;
		System.out.println("Volume is : " + volume);
	}
	
	
	public static void main(String[] args) {
		ClassC c1 = new ClassC();
		c1.Volume();
		c1.Addition();
		c1.Substraction();
		c1.Multiplication();
		c1.Division();
		c1.Modulus();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.name);

	}

}
