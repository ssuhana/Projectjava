package task4;

import java.util.Scanner;

class Main {
	  public static void main(String[] args) {

	    // create a string
	     //String s= "how are you";
		System.out.println("enter a string:");
        Scanner str=new Scanner(System.in);
        String s=str.nextLine();//next nu kudutha whitespace consider aagudhu for that you give nextLine
        
	    // stores each characters to a char array
	    char[] arr = s.toCharArray();
	    boolean space = true;

	    for(int i = 0; i < arr.length; i++) {

	      // if the array element is a letter
	      if(Character.isLetter(arr[i])) {

	        // check space is present before the letter
	        if(space) {

	          // change the letter into uppercase
	          arr[i] = Character.toUpperCase(arr[i]);
	          space = false;
	        }
	      }

	      else {
	        // if the new character is not character
	      space = true;
	      }
	    }

	    // convert the char array to the string
	    s = String.valueOf(arr);
	    System.out.println("Message: " + s);
	    str.close();
	  }
	}