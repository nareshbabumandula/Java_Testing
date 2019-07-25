package basics;

public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Core Java training");
		System.out.println("Learn about Primitive and non primitive Data types used in Java");
		
		//Primitive Data Types
		int a=10;
		boolean b =true;
		boolean c =false;
		char d='a';
		float f = 12.53f;
		double g =123.435436;
		byte b1=127;
		long l=12243;
		short s =23324;
		System.out.println("Integer value of a is : " + a);
		System.out.println("Boolean value of b is : " + b);
		System.out.println("Boolean value of c is : " + c);
		System.out.println("Char value of d is : " + d);
		System.out.println("Float value of f is : " + f);
		System.out.println("Double value of g is : " + g);
		System.out.println("Byte value of b1 is : " + b1);
		System.out.println("Long value of l is : " + l);
		System.out.println("Short value of s is : " + s);
		System.out.println("These are primitive data types");
		
		//Widening
		byte b2 = 123;
		int a2 = b2;
		System.out.println("Stored byte value into integer data type : " + a2);
		
		//Narrowing
		short s3 = 130;
		byte b3 = (byte) s3;
		System.out.println("Stored short value into byte data type : " + b3);
		
		
		//Non-primitive data types
		String sText = "hello world this is core java";
		System.out.println(sText);
		
		int Marks[]= {40,80,90,85,60};
		System.out.println(Marks[4]);
		

	}

}
	