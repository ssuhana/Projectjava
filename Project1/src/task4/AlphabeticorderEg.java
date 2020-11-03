package task4;
import java.util.Arrays;  
//import java.util.Scanner;

public class AlphabeticorderEg {

	// Java implementation of above approach  
	  
	// import  Arrays class 	  
	    // Function that checks whether  
	    // the string is in alphabetical  
	    // order or not  
	    static boolean isAlphabaticOrder(String s)  
	    {  
	        // length of the string  
	        int n = s.length();  
	        
	        // create a character array  
	        // of the length of the string  
	        char c[] = new char [n];  
	        
	        // assign the string  
	        // to character array  
	        for (int i = 0; i < n; i++) {  
	            c[i] = s.charAt(i);  
	        }  
	        
	        // sort the character array  
	        Arrays.sort(c);  
	        
	        // check if the character array  
	        // is equal to the string or not  
	        for (int i = 0; i < n; i++)  
	            if (c[i] != s.charAt(i))   
	                return false;  
	                
	        return true;      
	    }  
	      
	    public static void main(String args[]) 
	    { 
	        String s = "aabbbcd"; 
//	    	System.out.println("Enter a String");
//	        Scanner scan=new Scanner(System.in);
//	        String s=scan.next();
	          
	        // check whether the string is  
	        // in alphabetical order or not  
	        if (isAlphabaticOrder(s))  
	           System.out.println("yes");  
	        else
	            System.out.println("no");  
	            
	    //scan.close();
	    }
	    // This Code is contributed by ANKITRAI1 
	}

