package day11;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
public class Task2 {
	public static void main(String args[]) {
		List<String> l=Arrays.asList(new String[] {"apples","mango"});
		List list1=l.stream().map(str->str.length()).collect(Collectors.toList());
		System.out.println(list1);
	}

}
