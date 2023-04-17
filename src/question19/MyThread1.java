package question19;

public class MyThread1 {
	
	public void run()
	{
	System.out.println("Thread start running..");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 x1 = new MyThread1();
		((Object) x1).start();

}
}
