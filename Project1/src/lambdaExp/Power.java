package lambdaExp;
import java.util.function.BiFunction; 
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Double,Double,Double> obj=(x,y) -> Math.pow(x,y);
		System.out.println("power is "+obj.apply(4.0, 2.0));

	}

}
