package day5_2110;
import pack1.*;
import java.util.Scanner;

public class Tester implements PrimeTester {
	 public void eg() {
		 int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 n=sc.nextInt();
		 if((n%2)!=0)
		 {
			 System.out.println("prime");
		 }
		 else
		 {
			 System.out.println("not prime");
		 }
		 sc.close();
		
	}

	public static void main(String[] args) {
		Tester obj=new Tester();
		obj.eg();

	}

}
