package basics;

public class Shortcuts {
	
		
	/*//*****************************************************************************************************************************************************
	 1. Indentation -  Select the code and press Ctrl+I
	 2. Run - Ctrl+F11 or Right Click on Editor Run As > Java Application or Click on Run button from toolbar
	 3. Comment or uncomment a line of code - Ctrl+/
	 4. Comment a block of code - Ctrl+Shift +/
	 5. Uncomment a block of code - Ctrl+Shift +\
	 //*****************************************************************************************************************************************************
    */	

	//Data members
	int a=10;
	int b=20;
	int d=100;

	//Methods or Behavior
	public void Addition()
	{
		int c=a+b;
		System.out.println("Addition of a and is b is : " + c);
	}


	public void Substraction()
	{
		int c=a-b;
		System.out.println("Substraction of a and is b is : " + c);
	}



	public static void main(String[] args) {

		//Classname objname/instance = new Constructor name();
		Shortcuts s1 = new Shortcuts();
		s1.Addition();
		s1.Substraction();
		System.out.println("Value of a is : " + s1.a);
		System.out.println("Value of b is : " + s1.b);

	}

}
