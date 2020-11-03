package day11;
import java.util.*;
import java.util.stream.Stream;
import java.lang.*;
import java.util.stream.Collectors;
public class NumberGreater10Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(new Integer[] {1,2,3,20,40});
		Stream stream=list.stream();
//		stream.forEach(System.out::println);
     List<Integer> list2=list.stream().filter(i->i>10).collect(Collectors.toList());
     System.out.println(list2);	
     
     //to find greatest element in the list
     Optional<Integer> result=list.stream().reduce((a,b)->a>b?a:b);
     if(result.isPresent()) {
    	 System.out.println(result.get());
     }
}

}
