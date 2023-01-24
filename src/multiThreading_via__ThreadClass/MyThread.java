package multiThreading_via__ThreadClass;

public class MyThread extends Thread{

	public MyThread() {
		super("sub thread");
		System.out.println("Sub thread is initialized!");
		this.start();
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " sub thread " + this);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Sub thread is terminated");
				e.printStackTrace();
			}
		}
		System.out.println("Sub thread is overed!");
	}
}
