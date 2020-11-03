package day12;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class MethodReferenceEg {
	public static void main(String args[])
	{  
		List<Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(3,4,5,6);
	
	
	for(int i=0;i<l.size();i++) //1st method
	{
		System.out.println(l.get(i));
	}
		System.out.println();
		for(int o:l)//second method
			System.out.println(o);
		System.out.println();
		l.forEach(j ->//3rd method
		{
			System.out.println(j);
		});
		System.out.println();
		l.forEach(System.out::println);//4th method
	}

}
