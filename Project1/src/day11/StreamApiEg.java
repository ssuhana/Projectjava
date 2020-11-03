package day11;
import java.util.*;
//import java.util.stream.Stream;
//import java.lang.*;
import java.util.stream.Collectors;
public class StreamApiEg {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		
		//only even num and then double it
		//distinct:delete duplicates
		//limit(2) nu kudutha first 2 matum than edukum. 
		List<Integer> list1=list.stream().filter(i->i%2==0).map(i->i*2).distinct().limit(2).collect(Collectors.toList());
System.out.println(list1);
	}

}
