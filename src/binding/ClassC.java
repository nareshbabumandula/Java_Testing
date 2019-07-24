package binding;

public class ClassC {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
	/*	a.Login();
		b.Login();
		b.SearchProduct();
		b.AddToCart();*/
		
		
		
		//upcasting
		/*ClassA a1 = (ClassA)b;
		a1.Login();
		a1.Logout();
		
		//downcasting
		ClassA a2 = new ClassB();
		ClassB b2 = (ClassB) a2;
		b2.Login();
		b2.Logout();
		b2.SearchProduct();
		b2.AddToCart();*/
		
		ClassA a3 = new ClassA();
		ClassB b3 = (ClassB)a3;
		a3.Login();
	
		

	}

}
