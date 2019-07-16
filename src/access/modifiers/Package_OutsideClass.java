package access.modifiers;

public class Package_OutsideClass {

	public static void main(String[] args) {
		Package_Test pt = new Package_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();

	}

}
