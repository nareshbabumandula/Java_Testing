package basics;

public class StringManipulations {

	
	public void StringMethods()
	{
		String sText1 = "hello world";
		String sText2 = "WELCOME TO CORE JAVA TRAINING";
		String sText3 = "Your computer's time zone doesn't appear to match your account setting for (GMT-08:00) Pacific Time (US and Canada); Tijuana. If you want to change this, update your account.";
		String sText4 = "          All OpenVoice audio conferencing services           ";
	
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3.substring(0, 10));
		System.out.println(sText4.trim());
		System.out.println(sText1.concat(" ").concat(sText2));
		System.out.println(sText1 + " " + sText2);
		System.out.println(sText1.charAt(0));
		System.out.println(sText2.contains("JAVA"));
		System.out.println(sText3.isEmpty());
		System.out.println(sText1.equalsIgnoreCase("HELLO WORLD"));
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		StringManipulations sm = new StringManipulations();
		sm.StringMethods();
		

	}

}
