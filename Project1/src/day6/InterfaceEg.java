package day6;
//import day6.*;

public class InterfaceEg implements Interface{
	public void add()
	{
		System.out.println("adding in main");
	}
//	public void show()
//	{
//		System.out.println("in class");
//	}
	public static void main(String args[])
	{
		InterfaceEg obj=new InterfaceEg();
		obj.add();
		obj.show();
		Interface.show1();//to call a static method
	}

}
