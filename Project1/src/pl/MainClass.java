package pl;
import bean.*;
import service.*;
import java.util.*;
 public class MainClass {
		EmployeeService empService=new EmployeeServiceImpl();

		void getDetails()
		{
			char ch='Y';
			String name=null;
			Scanner scan=new Scanner(System.in);
		
		while (ch=='Y')
			{
				Employee emp =new Employee();
			System.out.println("Enter id");
			 emp.setId(scan.nextInt());
			 




			System.out.println("Do u want to continue");
			ch=scan.next().charAt(0);
			}
		}
		
		void displayDetails()
		{
			 
		}
		void Search(int id)
		{
			 
			
			
		} 
		
		
		public static void main(String[] args) {
		 
		MainClass obj=new MainClass();
		obj.getDetails();
		obj.displayDetails();
		System.out.println("Enter the emp id for which u want to search");
		Scanner scan=new Scanner(System.in);
	    int id=scan.nextInt();
	    obj.Search(id);
		}

	}

