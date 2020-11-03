package day7;
import java.io.*;
import java.util.Scanner;
class MyNegativeException extends Exception{
	public String toString() {
		return "Password is incorrect";
	}
}
public class NewClass{
	static String password()
	{  
		return "suha@12";
	}
	public static void main(String[] args)
	{
		String password1=password();
		int a=0;
		for(int i=0;i<3;i++) {
			System.out.println("enter your password");
			Scanner scan=new Scanner(System.in);
			String b=scan.next();
			if(b.equals(password1))
			{
			  a=1;
			  System.out.println("welcome");
				break;
			}
			System.out.println("flag: "+(i+1));
		try {
			if(a==0)
			throw new MyNegativeException();
			else
				System.out.println("continue");
		}
		catch(MyNegativeException e){
			System.out.println(e);	
			//System.out.println(e.getAge());
		}
	}
	}
}


