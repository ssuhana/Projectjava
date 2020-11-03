package day8;
import java.util.*;
import java.util.ArrayList;
public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> A=new ArrayList<Integer>();//parentname obj=new child();
ArrayList<String> B=new ArrayList<String>();
for(int i=0;i<5;i++) {
	A.add(i);
}
System.out.println(A);
B.add("java");
B.add("beginner");
B.add(".");
B.add("tutorial");
B.add(3,"com");
B.add("java");
B.add("site");
System.out.println("Second element is: " +B.get(2));
B.remove("java");
Iterator i1=A.iterator();
System.out.println("Arraylist A--> ");
while(i1.hasNext())
{
	System.out.println(i1.next() + " " );
}
System.out.println();
System.out.println("ArrayList A --> ");
for(int j=0;j<A.size();j++)
{
	System.out.println(A.get(j) + "   " );
}
System.out.println();
//Sorting
System.out.println("Sorted array");
Collections.sort(A);//collection is a class
System.out.println(A);
 Integer a[]= {11,12,13};
 List<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(a));
 System.out.println("arrList"+arrlist.get(0));
 
		 
 
}


	}
