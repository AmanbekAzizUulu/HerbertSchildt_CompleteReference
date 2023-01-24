package multiThreading_via__RunnableInterface;

public class Main {

	public static void main(String[] args) {
		new MyThread();
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(i + " main thread " + Thread.currentThread());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread is overed!");
	}

}
