package pack1;
import day5_2110.*;
import pack11.*;
public class InterfaceEg extends AbstractEg implements I1{
	public void meth3() {
		System.out.println("friends");				
	}
	public void meth4() {
		System.out.println("forever");
	}
	public void meth5()
	{
		System.out.println("interfacemethod 5");
	}
	public void meth6()
	{
		System.out.println("interfacemethod 6");
	}
	public void meth7()
	{
		System.out.println("interfacemethod 7");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEg obj=new InterfaceEg();
		I1 obj1=new InterfaceEg();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj1.meth5();
		obj1.meth6();
		obj1.meth7();
	}
}

