package day10;
class NewThread extends Thread{
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child :"+i);
				Thread.sleep(600);
			}
		}catch(InterruptedException e) {
			System.out.println("Child interrupted");

		}
	}
}

public class ThreadsEg {
	public static void main(String args[]) {
		NewThread t=new NewThread();
		t.setName("Demo Thread");
		System.out.println("child thread" +t);
		t.start();
		t.interrupt();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("main thread "+i);
				Thread.sleep(300);
			}
		}catch(InterruptedException e){
			System.out.println("main thread interrupted");
				
				
			}
		}

	}


