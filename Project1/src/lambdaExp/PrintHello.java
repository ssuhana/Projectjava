package lambdaExp;
interface I1 {
    public String helloWorld();
}
public class PrintHello {
	   public static void main(String args[]) {
	    	I1 obj = () -> {
	    		return "Hello Suhana";
	    	};
	    	System.out.println(obj.helloWorld());
	        
	    }

	}

