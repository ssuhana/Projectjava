package day3;

public class Employees {
	int eid;
	String ename;
	void accept(int a,String b) {
		eid=a;
		ename=b;
	}
	void display()
	{
		System.out.println(eid);
    	System.out.println(ename);
	}
	public static void main(String[] args) {
		Employees obj=new Employees();
		obj.accept(Integer.parseInt(args[0]),args[1]);
		obj.display();
	}

}
