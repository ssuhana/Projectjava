package day7;

public class TryCatchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    try {
//			    	System.exit(0);
			      int a=5/0;
			      
			      System.out.println("I am in try"+a);
			      System.exit(0);
			    } 
			    catch(ArithmeticException e)
			    {
			    	System.out.println("In airthmetic block");
			    }
			    catch (Exception e) {
			      System.out.println("Something went wrong."+e);
			    }
			    finally {
			    	System.out.println("suhana");
			    }
			  }
			}
