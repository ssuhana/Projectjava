package day4;
import java.util.Scanner;
public class StudentArray {
	int id;
	String name;
	public static void main(String[] args) {
		StudentArray stu[]=new StudentArray[5];
		for(int i=0;i<stu.length;i++)
		{
			stu[i]=new StudentArray();
			stu[i].accept();
			stu[i].display(stu[i]);
			
		}
	}
public void accept()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the details");
	id=scan.nextInt();
	name=scan.next();
}
void display(StudentArray stu)
{
	System.out.println(id+" "+name);
}

}
