package day8;
import java.util.*;
public class CollectionEg {
	public static void main(String args[])
	{
	HashSet<String> s1=new HashSet<String> ();
//	Scanner scan=new Scanner();
//	String scan=
	s1.add("suha");
	//s1.add("java");
	s1.add("suha");
	s1.add("learn");
	System.out.println("Elements are: "+s1);
	System.out.println("s1.contains java: "+s1.contains("java"));
	TreeSet<String> t1=new TreeSet<String>(s1);
	System.out.println("t1.equals s1 : "+t1.equals(s1));
	///Iterator<String> itr=t1.iterator();
//	System.out.println("Interation Type 1 :");
//	while(itr.hasNext()) {
//		String e=(String)itr.next();
//		System.out.println(e);
//	}
	System.out.println("Iteration Type 2 : ");
	for(String o: t1) {
		System.out.println(o);
		
	}

}
}