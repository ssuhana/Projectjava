//a employee class with objects.create arrylist/hashset...iterate an get the result

package day9;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;

public class EmployeeArr {
    int eid;
	String ename;
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
   EmployeeArr(int eid,String ename) {
	   this.eid=eid;
	   this.ename=ename;
		
	}
   public String toString() {
	   return eid+ " "+ename;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeArr obj=new EmployeeArr();
//		List<Integer> A=new ArrayList<Integer>();//parentname obj=new child();
//		ArrayList<String> B=new ArrayList<String>();
//		A.add(12);
//		B.add("beginner");
//		System.out.println("Second element is: " +A+" "+B);
//		Iterator i1=A.iterator();
//		System.out.println("Arraylist A--> ");
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next() + " " );
//		}
//		System.out.println();
		HashSet<EmployeeArr> s1=new HashSet<EmployeeArr> ();
		EmployeeArr o1=new EmployeeArr(1,"suha");
		EmployeeArr o2=new EmployeeArr(1,"suha");
		s1.add(o1);
		s1.add(o2);
		for(EmployeeArr e:s1)
		{
			System.out.println(e);
		}
	}
//
	}
