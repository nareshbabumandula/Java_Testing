package basics;

public class StringClasses {
	
	
	public void StringExample()
	{
		String sText1 = "hello";
		String sText2 = "world";
		String strResult = sText1 + " "  + sText2;
		System.out.println(strResult);
	}
	
	
	public void StringBufferExample()
	{
		long bufferStartTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("hello");
		for (int i = 0; i < 10000; i++) {
			buffer.append("world");
		}
		long bufferEndTime = System.currentTimeMillis()-bufferStartTime;
		System.out.println("Time taken by StringBuffer is : " + bufferEndTime + "ms");
	}
	
	public void StringBuilderExample()
	{
		long builderStartTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("hello");
		for (int i = 0; i < 10000; i++) {
			builder.append("world");
		}
		long builderEndTime = System.currentTimeMillis()-builderStartTime;
		System.out.println("Time taken by StringBuilder is : " + builderEndTime + "ms");
	}

	public static void main(String[] args) {
		StringClasses sc = new StringClasses();
		sc.StringExample();
		sc.StringBufferExample();
		sc.StringBuilderExample();

	}

}
