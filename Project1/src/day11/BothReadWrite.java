package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BothReadWrite {
	void readFile() throws IOException
	{
		FileInputStream f=null;
		byte b[]=new byte[100];
		//BufferedInputStream bi=null;
		try
		{
			
			f=new FileInputStream("Text1.txt");
			f.read(b);
			String str=new String(b);
			System.out.println(str.trim());;
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());;
			
					
		}
		finally
		{
			f.close();
		}
	}
	void write()  throws IOException{
		
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
	public static void main(String args[]) throws IOException{
		BothReadWrite rd=new BothReadWrite();
		rd.write();
		rd.readFile();
	}


}
