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
		System.out.println(sText1.indexOf('h'));  //Returns the index of the char found
		System.out.println(sText2.endsWith("TRAINING")); //Returns the boolean true or false
		System.out.println(sText2.toLowerCase().contains("java"));
		System.out.println(sText2.contains("java".toUpperCase()));
		System.out.println(sText3.startsWith("Your"));
		System.out.println(sText1.length()); // Returns the Length of the string
		System.out.println(sText3.lastIndexOf("to")); // Returns the last index of the substring found in the main string
		System.out.println(sText3.lastIndexOf('o')); // Returns the last index of the char found in the main string
		System.out.println(sText2.replaceAll("TRAINING", "SELENIUM TRAINING"));

		String[] strValues = sText2.split(" ");
		System.out.println(strValues[0]);

		for (int i = 0; i < strValues.length; i++) {
			System.out.println(strValues[i]);
		}
		System.out.println(sText2.join(">", strValues));
	}


	public static void main(String[] args) {

		StringManipulations sm = new StringManipulations();
		sm.StringMethods();
	}

}
