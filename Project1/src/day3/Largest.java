package day3;
import java.util.Scanner;
public class Largest 
{
	int great()
	{
	int no=0, large=0;
    Scanner scan = new Scanner(System.in);
    //no of elements in an array
    no = scan.nextInt();
    int arr[] = new int[no];
    //Enter the array elements
    for(int i = 0; i < no; i++)
    {
        arr[i] = scan.nextInt();
    }
    large=arr[0];
    //largest element logic
    	for(int i = 0; i < no; i++)
    	{
    		if(large < arr[i])
    		{
    			large = arr[i];
    		}
    	}
    return large;
    }
	public static void main(String[] args) 
	{
        Largest largest=new Largest();
        System.out.println(largest.great());
    }
}