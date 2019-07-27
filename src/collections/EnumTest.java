package collections;

enum Days {
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
}

enum Months {
	
	JANURARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
	
}


public class EnumTest
{
	public static void main(String args[])
	{
		Days d = Days.MONDAY;
		System.out.println(d);
		Months m = Months.DECEMBER; 
		System.out.println(m.toString());
		System.out.println(m); // Internally calls .toString method
		
		
	}
}


	
