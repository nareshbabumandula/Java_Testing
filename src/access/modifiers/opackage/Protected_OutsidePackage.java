package access.modifiers.opackage;

import access.modifiers.Protected_Test;

public class Protected_OutsidePackage extends Protected_Test{

	public static void main(String[] args) {
		/*Protected_Test pt = new Protected_Test();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.AccessSite();
		pt.Login();
		pt.SearchProduct();
		pt.Logout();*/
		
		Protected_OutsidePackage po = new Protected_OutsidePackage();
		po.AccessSite();
		po.Login();
		po.SearchProduct();
		po.Logout();
		System.out.println(po.URL);
		System.out.println(po.USERNAME);
		System.out.println(po.PASSWORD);
		

	}

}
