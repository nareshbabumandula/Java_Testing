package control.statements;

public class DoLoopTest {

	
	public void DoExample()
	{
		int i=0;
		
		do {
			System.out.println("Value of i is : "+ i);
			i++;
			if (i==6) {
				break;
			}
		} while (i<10);
	}
	
	
	
	
	public static void main(String[] args) {
		
		DoLoopTest dt = new DoLoopTest();
		dt.DoExample();

	}

}
