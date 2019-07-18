package exceptions;

public class UncheckedExceptionTest {
	
	public void uncheckedExceptionExample()
	{
		try {
			int a=10;
			int b=a/0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args) {
		UncheckedExceptionTest unchecked = new UncheckedExceptionTest();
		unchecked.uncheckedExceptionExample();

	}

}
