package day7;
import java.io.*;
public class BufferedReaderEg {

	public static void main(String[] args)//throws IOException 
	{
		try 
		{
	// TODO Auto-generated method stub
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String s=a.readLine();
		System.out.println("enter no");
		int n=Integer.parseInt(a.readLine());
		System.out.println(s+" "+n);
	    }
	    catch(Exception e)
		{
		System.out.println(e);
		}
	}

}
