package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String> ();
		Scanner scan=new Scanner(System.in);
		//System.out.println("enter the num of strings");
		//String[] string = new String [scan.nextInt()];
		//scan.nextLine();
		for(int i=0;i<3;i++)
		{
			s1.add(scan.next());//=scan.nextLine();
		}
//		for(int i=0;i<3;i++)
//		{
//			String=scan.nextLine(i);
//		}
		System.out.println(s1);
//		s1.add("suha");
//		s1.add("learn");
		TreeSet<String> t1=new TreeSet<String>(s1);
		System.out.println("t1.equals s1 : "+t1.equals(s1));List<Integer> A=new ArrayList<Integer>();//parentname obj=new child();
		List<String> obj=new ArrayList<String>(t1);//parentname obj=new child();
		//ArrayList<String> B=new ArrayList<String>(t1);
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}

	}

}
