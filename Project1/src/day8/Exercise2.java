package day8;
//import day8.Excercise1;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		HashMap<HashSet<String>,List<Integer>> a= new HashMap<HashSet<String>,List<Integer>>();
		HashSet<String> s1=new HashSet<String> ();
		s1.add("How");
		s1.add("Are");
		s1.add("You");
		List<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		a.put(s1,A);
		System.out.println(a);
}
}
