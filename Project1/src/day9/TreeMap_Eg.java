package day9;
import java.util.*;

public class TreeMap_Eg {
	public static void main(String[] args) {
	//HashMap<String,Integer> a= new HashMap<String,Integer>();
	//a.put(null, new Integer(1));
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	TreeMap<Integer,String> t2=new TreeMap<Integer,String>();
	t1.put(1,null);//value can be null
	t2.put(null,"suha");//key cannot be null
	
	System.out.println(t1);
	System.out.println(t2);
}
}
