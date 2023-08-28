package Mutlithread;
import java.lang.Runnable;

class multithreaddemo implements Runnable{
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class thread2 {
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			Thread th2=new Thread(new multithreaddemo());
			th2.start();
		}
	}
}
