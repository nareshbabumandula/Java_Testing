package access.modifiers;

public class Public_OutsideClass {

	public static void main(String[] args) {
		Public_Test pt1 = new Public_Test();
		System.out.println(pt1.URL);
		System.out.println(pt1.USERNAME);
		System.out.println(pt1.PASSWORD);
		pt1.AccessSite();
		pt1.Login();
		pt1.SearchProduct();
		pt1.Logout();

	}

}
