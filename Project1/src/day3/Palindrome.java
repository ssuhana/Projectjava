package day3;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Palindrome obj = new Palindrome();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String s = sc.next();
	System.out.println(obj.accept(s));
}

		public boolean accept(String a)
		{
		String palin = "";
		for(int i= a.length()-1;i>=0;i--) 
		{
		palin = palin + a.charAt(i);
        }

		if(palin.equals(a))
			return true;
		else
			return false;
		}
}
