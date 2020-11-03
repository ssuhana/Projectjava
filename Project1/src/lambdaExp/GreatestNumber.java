package lambdaExp;
@FunctionalInterface
interface I2 {
	
    public int greatestNo(int a,int b);
    
}
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I2 a = (num,num1) -> {
			if (num >  num1)
				return num;
			return num1;
			
			
		};
    	System.out.println(a.greatestNo(5,2));

	}

}
