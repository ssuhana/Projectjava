package task4;


import java.util.Scanner;

public class StringOperations {
	
	String str="Suhana";
	public void appendString() {
		StringBuffer s=new StringBuffer(str);
		System.out.println("append string to itself");
		System.out.println(s.append(str));
	}
	
	public void insertHash()
	{
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				a[i]='#';
		}
		String s1=new String(a);
		System.out.println(s1);
	}
	
	public void removeDuplicates()
	{
		System.out.println("Before removing Dulicates");
		String s2=new String();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(s2.indexOf(c)<0)
			{
				s2 +=c;
			}
			System.out.println("after removing duplicates");
			System.out.println(s2);
		}
	}
	
	public void changeUppercase()
	{
		System.out.println("changing Odd charactrs to upper case");
		char c1[]=str.toCharArray();
		for(int i=0; i<c1.length; i=i+2){
	         c1[i] = Character.toUpperCase(c1[i]);
		}
		String s3=new String(c1);
		System.out.println(s3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations s=new StringOperations();
		Scanner scan=new Scanner(System.in);
		for(int j=0;j<=4;j++) {
		char Y = 0,ch = 0;
		do
		{
			System.out.println("1.append 2.Insert Hash 3.Remove Duplicates 4.Upper Case");
			System.out.println("enter ur choice");
			int i=scan.nextInt();
			switch(i)
			{
			case 1:s.appendString();
			break;
			
			case 2:s.insertHash();
			break;
			
			case 3:s.removeDuplicates();
			break;
			
			case 4:s.changeUppercase();
			break;
			
			
			}
		}while(ch!=Y);
	}
	}	

}
