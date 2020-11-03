package day3;

public class Constructor {
	int eid;
	String ename;
//	Employee()
//	{  
//		eid=10;
//		ename="suhana";
//	}
	Constructor(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
//	void display()
//	{
//		//System.out.println(" The employee id is " + eid+ " and "+ename + " is the employee name");
//		System.out.println("the employee name and id is "+ ename + " and " + eid );
//	}
	public static void main(String[] args) {
//		Employee obj1=new Employee();
		Constructor obj2=new Constructor(1,"subha");
//		obj1.display();
		//obj2.display();
		// TODO Auto-generated method stub
		System.out.println(obj2.eid);//returning an object

	}

}
