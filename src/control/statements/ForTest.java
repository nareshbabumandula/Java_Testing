package control.statements;

public class ForTest {

	public void ForExample()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is : " + i);
		}
				
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value is : " + i);
			if (i==6) {
				break;
			}
		}
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Iteration Value is : " + i);
			if (i==6) {
				continue;
			}
		}
	
	}
	
	public void EnhancedForExample()
	{
		for (int i = 0; i < 10; i++) System.out.println("Iteration is : " + i);
	}
	
	public void ForEachExample()
	{
		String persons[] = {"pavan","ashwini","ravi","poornima","teja","naresh"};
		
		for (String name : persons) {
			System.out.println(name);
		}
		
	}
		
	public static void main(String[] args) {
		ForTest ft = new ForTest();
		ft.ForExample();
		ft.ForEachExample();
		ft.EnhancedForExample();
	}

}
