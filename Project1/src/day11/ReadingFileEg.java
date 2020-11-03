package day11;
import java.io.*;
import java.util.*;

import java.io.FileInputStream;

public class ReadingFileEg {
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
	public static void main(String args[]) throws IOException{
		ReadingFileEg rd=new ReadingFileEg();
		rd.readFile();
	}

}
