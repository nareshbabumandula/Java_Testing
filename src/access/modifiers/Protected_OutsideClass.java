package access.modifiers;

public class Protected_OutsideClass {

	public static void main(String[] args) {
		Protected_Test pt = new Protected_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
