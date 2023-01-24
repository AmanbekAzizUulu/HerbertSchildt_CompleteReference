package multiThreading_via__RunnableInterface;

public class MyThread implements Runnable {
	private Thread myThread;
	
	public MyThread() {
		setMyThread(new Thread(this, "sub thread"));
		System.out.println("Sub thread is initiated");
		getMyThread().start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " sub thread " + getMyThread());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread is terminated");
			}
		}
		System.out.println("Sub thread is overed");
	}


	public Thread getMyThread() {
		return myThread;
	}


	public void setMyThread(Thread myThread) {
		this.myThread = myThread;
	}

}
