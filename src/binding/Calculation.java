package binding;

public class Calculation extends Arithmatic{

	public void Substraction()
	{
		int a=100;
		int b=20;
		int c=a-b;
		System.out.println("Substraction of a and b is : " + c);
	}
	
	
	public static void main(String[] args) {
		// The below cc is an instance of Calculation class, but it is also an instance for Arithmatic class
		Calculation cc = new Calculation();

	}

}
