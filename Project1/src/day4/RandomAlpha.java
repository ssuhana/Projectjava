package day4;
import java.util.*;
public class RandomAlpha {
	char result;
	char arr[];
	char temp[];
	int n,j;
	void accept() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		n=scan.nextInt();
		arr=new char[n];
		Random r=new Random();
		System.out.println("Before sorting and removing duplicates");
		for(int i=0;i<n;i++)
		{
			arr[i]=(char)(r.nextInt(26)+65);
			System.out.println(" ");
			System.out.println(" "+arr[i]+" ");
		}
	}
	void sort()
	{
		System.out.println("After sorting");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					result=arr[i];
					arr[i]=arr[j];
					arr[j]=result;
					
				}
			}
			System.out.println(" "+arr[i]+" ");
		}
	}
	void duplicate()
	{
		temp=new char[n];
		j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
				
			}
		}
		temp[j++]=arr[n-1];
	}
	void print()
	{
		System.out.println("after removing duplicates");
		for(int i=0;i<j;i++)
		{
			System.out.println(" "+temp[i]);
			
		}
	}
	public static void main(String[] args) {
		RandomAlpha r1=new RandomAlpha();
		r1.accept();
		r1.sort();
		r1.duplicate();
		r1.print();
		
	}
}
