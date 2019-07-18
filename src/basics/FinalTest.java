package basics;

public final class FinalTest {
	
	final int marks=90;
	
	public final void updateMarks()
	{
		//marks=75;
		System.out.println("Latest marks is : " + marks);
	}
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.updateMarks();
	}

}
