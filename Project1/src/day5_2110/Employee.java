package day5_2110;
class Phone{
	String phone_id;
	String phone_type;
	int phone_no;
	public Phone(String phone_id, String phone_type, int phone_no) {
		this.phone_id = phone_id;
		this.phone_type = phone_type;
		this.phone_no = phone_no;
	}
}
public class Employee {
	int eid;
	String ename;
	Phone details;
	public Employee(int eid, String ename, Phone details) {
		this.eid = eid;
		this.ename = ename;
		this.details = details;
	}
	void display()
	{
		System.out.println("Id: "+eid+"\nName: "+ename);
		System.out.println("Phone_Id: "+details.phone_id+"\nPhone_type: "+details.phone_type+"\nPhone_Number: "+details.phone_no);
		
	}
	public static void main(String args[])
	{
		Phone p=new Phone("ID123","mobile",123456789);
		Employee e=new Employee(123,"suhana",p);
		e.display();
	}
}
