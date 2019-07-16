package access.modifiers.opackage;

import access.modifiers.Public_Test;

public class Public_OutsidePackage {

	public static void main(String[] args) {
		Public_Test pt2 = new Public_Test();
		System.out.println(pt2.URL);
		System.out.println(pt2.USERNAME);
		System.out.println(pt2.PASSWORD);
		pt2.AccessSite();
		pt2.Login();
		pt2.SearchProduct();
		pt2.Logout();

	}

}
