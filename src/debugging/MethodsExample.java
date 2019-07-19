package debugging;

public class MethodsExample {

	int a=10;
	int b=20;


	// 1. Method without arguments/parameters and without return type 
	public void Addition()
	{
		int a=30;
		int b=40;
		Modulus(a, b);
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	// 2. Method with arguments/parameters and without return type 
	public void Substraction(int a, int b)
	{
		int c=a-b;
		System.out.println("Substraction of a and b is : " + c);
	}

	// 3. Method without arguments/parameters and with return type 
	public int Multiplication()
	{
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
		return c;
	}

	// 4. Method with arguments/parameters and with return type 
	public int Division(int a, int b)
	{
		int c=a/b;
		System.out.println("Division of a and b is : " + c);
		return c;
	}

	public int Modulus(int a, int b)
	{
		int c=a/b;
		System.out.println("Modulus of a and b is : " + c);
		return c;
	}



	// 5. Method with return type as array
	public int[] Marks()
	{
		int[] Marks= {30,40,80,70,90};
		return Marks;
	}


	public static void main(String[] args) {
		MethodsExample method = new MethodsExample();
		method.Addition();
		method.Substraction(100, 50);
		int output1 = method.Multiplication();
		System.out.println("Return value of Multiplication is : " + output1);
		int output2 = method.Division(200, 10);
		System.out.println("Return value of Division is : " + output2);
		int output[] = method.Marks();
		System.out.println(output[0]);
	}

}
