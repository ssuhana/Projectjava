package day12;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateTimeAPI {
	public static void main(String args[])
	{
		LocalDate obj=LocalDate.now();
		System.out.println(obj);
		LocalTime obj1=LocalTime.now();
		System.out.println(obj1);
		int dd=obj.getDayOfMonth();
		int mm=obj.getMonthValue();
		int yy=obj.getYear();
		System.out.println(obj.getMonth());
		System.out.printf("%d %d %d",dd,mm,yy);
		DateTimeFormatter n1=DateTimeFormatter.ofPattern("dd MM yy");
		String Date1=obj.format(n1);
		System.out.println(Date1);

		
		
	}

}
