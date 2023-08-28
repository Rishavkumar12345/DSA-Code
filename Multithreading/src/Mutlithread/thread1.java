package Mutlithread;
import java.lang.Thread;

class multithread extends Thread{
	@Override
	public void run() {
		try{
			System.out.println("Hello thread "+Thread.currentThread());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class thread1 {
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			multithread th1=new multithread();
			th1.start();
		}
	}
}
