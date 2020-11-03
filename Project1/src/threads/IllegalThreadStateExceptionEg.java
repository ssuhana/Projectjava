package threads;

public class IllegalThreadStateExceptionEg extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IllegalThreadStateExceptionEg d1 = new IllegalThreadStateExceptionEg();
		       d1.start();
		       d1.start();
		   
	}

}
