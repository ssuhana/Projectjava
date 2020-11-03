package day10;
class New_Thread implements Runnable{
		public void run() {
			try {
				for(int i=5;i>0;i--) {
					System.out.println("Child :"+i);
					Thread.sleep(600);
				}
				System.out.println("child thread exiting");

			}catch(InterruptedException e) {
				System.out.println("Child interrupted");

			}
		}
	}

public class RunnableEg {
		public static void main(String args[]) {
			New_Thread obj=new New_Thread();
			Thread t=new Thread(obj);
			t.setName("Demo Thread");
			System.out.println("child thread" +t);
			t.start();
			//t.interrupt();
			try {
				for(int i=5;i>0;i--) {
					System.out.println("main thread "+i);
					Thread.sleep(300);
				}
				t.join();
				System.out.println("main thread exiting");

				//t.join();
			}catch(InterruptedException e){
				System.out.println("main thread interrupted");
					
					
				}
			}

		}

