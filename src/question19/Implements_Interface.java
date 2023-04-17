package question19;

public class Implements_Interface implements Runnable {
	
	public void run(){
		System.out.println("Thread started running..");
		}

	public static <MyThread1> void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 x2 = new MyThread1();
		Thread tred = new Thread((Runnable) x2);
		tred.start();

	}

}
