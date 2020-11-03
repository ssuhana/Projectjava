package day11;
interface MyInterface {
	
    //public int add10(int a);expression with single parameter num
    public String helloWorld();
}
    public class LambdaEgTask {   

   public static void main(String args[]) {
        // lambda expression with single parameter num
    	//MyInterface a = (num) -> num+10;
    	 // lambda expression with no parameter
    	MyInterface msg = () -> {
    		return "Hello";
    	};
    	System.out.println(msg.helloWorld());
        
    	//System.out.println(a.add10(5));//expression with single parameter num
    }

}
