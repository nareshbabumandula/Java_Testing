package oops;

public class EncapsutionSubClass extends EncapsulationTest{

	public static void main(String[] args) {
		
		EncapsutionSubClass es = new EncapsutionSubClass();
		es.setUSERNAME("Pavan");
		System.out.println(es.getUSERNAME());
		es.setPASSWORD("secure1234");
		System.out.println(es.getPASSWORD());
	}

}
