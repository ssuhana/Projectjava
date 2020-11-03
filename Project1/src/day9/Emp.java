package day9;
//import java.util.*;
public class Emp {
	private int empid;
	String name;
	public Emp(int empid,String name) 
	{
		this.empid=empid;
		this.name=name;
	}
	public int hashCode()
	{
		return 12;
	}
	public boolean equals(Object ob)
	{
		boolean flag=false;
		Emp e=(Emp)ob;
		if((this.empid==e.empid)&&((this.name)).equals(name)) 
				flag=true;
			return flag;

	}
}

