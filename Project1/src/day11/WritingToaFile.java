package day11;
import java.io.*;
import java.util.*;

public class WritingToaFile  {

	public static void main(String[] args) 
	{

		 //byte b[]=new byte[100];
        FileOutputStream fout=null;
        try {
        	Scanner scan=new Scanner(System.in);
			System.out.println("enter text");
			String s=scan.nextLine();
        	//System.in.read(b);
        	fout=new FileOutputStream("Text1.txt",true);//true is given to tell append mode
        	fout.write(s.getBytes());
        	fout.write("\r\n".getBytes());
        	//fout.close();
        	scan.close();
        } 
        
        catch(IOException e) 
        {
        	e.printStackTrace();
        }
        finally{
        	try {
				fout.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
		
        	
        }
	}

