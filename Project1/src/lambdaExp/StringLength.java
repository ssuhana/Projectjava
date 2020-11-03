package lambdaExp;
@FunctionalInterface
interface MyEg {
	
    public int stringLength();
    
}
public class StringLength
 {

   public static void main(String args[]) {
        
	   MyEg msg = () -> {
		   String s="hi";
		   
   		return s.length();
   	};
    	System.out.println(msg.stringLength());

}


}
