package day9;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class SimpleDateFormatEg_Task1 {

	public static void main(String[] args) { 
		Date d = new Date();
//		SimpleDateFormat obj = new SimpleDateFormat("hh:mm:ss  a");
//		System.out.println("time "+obj.format(d));
		SimpleDateFormat obj1 = new SimpleDateFormat("MM, dd, yyyy  hh:mm:ss  a");
		System.out.println("Output "+obj1.format(d));
		
		

	}

}
