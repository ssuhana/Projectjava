package lambdaExp;

interface MyInterface {
	
    public int add2Num(int a,int b);
    
}
public class Add2Num {

   public static void main(String args[]) {
        
    	MyInterface a = (num,num1) -> (num+num1);
    	System.out.println(a.add2Num(5,5));

}


}
