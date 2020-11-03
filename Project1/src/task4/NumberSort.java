package task4;
import java.util.*;

public class NumberSort {
	
	int n;
	int[] arr;
	public void arrangenumbs()
	{
		List<Integer> A=new ArrayList<Integer>();//parentname obj=new child();
		ArrayList<String> B=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			A.add(i);
		}
		System.out.println(A);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size of Array");
//		n=sc.nextInt();
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter elements  Array");
//		scan.next();
//		arr=new int[n];
//		//Random r=new Random();
		
		for(int i=0;i<n;i++) {
			//arr[i]=scan;
			System.out.println(arr[i]);
		}
		//sc.close();
		
	}
	
	public void compare()
	{
		for(int i=0;i<n-3;i++) {
			if(arr[i]==0&&arr[i+1]==1&&arr[i+2]==3) {
				System.out.println("true");
			}
		}
		System.out.println("false");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberSort ns=new NumberSort();
		ns.arrangenumbs();
		ns.compare();
		
	}

}
