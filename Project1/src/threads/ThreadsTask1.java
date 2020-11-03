package threads;
import java.util.*;
//public class ThreadsTask1 {
class sum1 implements Runnable
	{ 
	int a;
	public sum1(int a){
	    this.a = a;
	}

	public void run()
	{
	    add();
	}

	public void add()
	{
	    Random rand = new Random();
	    int  n = rand.nextInt(10) + 1;
	    System.out.println("nmber generated:" + n); 
	    synchronized (this)
	    {
	        a += n;   
	    }
	}
	}
public class ThreadsTask1 {
	public static void main(String[] args)
	{
	    int sum = 0;
	    sum1 sum2 = new sum1(sum);
	    Thread t1 = new Thread(sum2);
	    Thread t2 = new Thread(sum2);
	    Thread t3 = new Thread(sum2);
	    Thread t4 = new Thread(sum2);
	    Thread t5 = new Thread(sum2);
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	    try {
	        t1.join();
	        t2.join();
	        t3.join();
	        t4.join();
	        t5.join();
	        System.out.println("thread alive "+t1.isAlive());
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.print("final result: " + sum2.a);
	    
}
}


