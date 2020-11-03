package day8;
import java.util.*;
public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> a= new HashMap<String,Integer>();//this is wrong <Innteger,String> is correct
		HashMap<String,Integer> b= new HashMap<String,Integer>();
		a.put(null, new Integer(1));
		a.put("two", new Integer(2));
		a.put("Three", new Integer(3));
		a.put("Three", new Integer(5));
		b.putAll(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println("Hashmap contains: "+a.size()+"Key value pairs");
		if(a.containsValue(new Integer(1)))
		{
			System.out.println("hashmap contains 1 as value");
		}
		else {
			System.out.println("Hashmap does not contain 1 as " + "value");
			
		}
		System.out.println("Retrieving all keys from"+"the HashMap");
		Iterator<String> iterator=a.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		System.out.println("Retriving all key values pairs");
		Iterator<Map.Entry<String,Integer>> itr=a.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("hash maps values");
		Iterator<Integer> i=a.values().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Using enchanced for loop");
		for(String aKey:a.keySet())
		{
			Integer aValue=a.get(aKey);
			System.out.println(""+ aKey + ":" + aValue);
		}
		
	}

}
