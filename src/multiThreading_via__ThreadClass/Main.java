package multiThreading_via__ThreadClass;

public class Main {

	public static void main(String[] args) {
		new MyThread();
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " main thread " + Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main thread is terminated");
				e.printStackTrace();
			}
		}
		System.out.println("Main thread is overed!");
	}

}
