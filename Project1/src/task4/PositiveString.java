package task4;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {
    public static boolean sorting(String s) {
    	char a[]=s.toCharArray();
    	Arrays.sort(a);
    	System.out.println(new String(a));
    	//
    	for(int i=0;i<a.length;i++)
    		if(a[i]!=s.charAt(i))
    			return false;
    	return true;
    }
    public static void main(String args[])
    {    
    	System.out.println("enter a string:");
        Scanner str=new Scanner(System.in);
        String s1=str.nextLine();
    	if(sorting(s1))
    	{
    		System.out.println("positive string");
    	}
    	else
    		System.out.println("negative string");
    str.close();
    }
}
