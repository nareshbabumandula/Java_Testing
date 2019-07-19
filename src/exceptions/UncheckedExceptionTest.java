package exceptions;

public class UncheckedExceptionTest
{

	public void uncheckedExceptionExample()
	{
		try 
		{
			int Marks[] = {80,70,40,95};
			System.out.println(Marks[0]);
			System.out.println(Marks[1]);
			System.out.println(Marks[4]);
			int a=100;
			int b=a/0;
			System.out.println(b);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException is called");
			e.printStackTrace();
		}
		
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException is called");
			e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException is called");
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println("Exception is called");
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		UncheckedExceptionTest unchecked = new UncheckedExceptionTest();
		unchecked.uncheckedExceptionExample();

	}

}
