package day9;

import java.util.HashSet;

public class OverridingEqualsOfObjectClass {
	public static void main(String args[])
	{
		Emp e1=new Emp(24,"ss");
		Emp e2=new Emp(24,"ss");
		Emp e3=new Emp(25,"ss");
		HashSet<Emp> obj=new HashSet<Emp>();
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		System.out.println(obj.size());
		
	}

}