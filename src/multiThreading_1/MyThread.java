package multiThreading_1;

public class MyThread implements Runnable {
	private String threadName;
	private Thread thread;
	
	public MyThread(String threadName) {
		setThread(new Thread(this, threadName));
		System.out.println("New Sub thread is initialized");
		this.getThread().start();
	}		

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " sub thread " + this.getThread());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Sub thread is terminated!");
				e.printStackTrace();
			}
		}
		System.out.println("Sub thread " + this.getThread() + " is overed!");
	}
/***************************Setters and Getters********************************/
	public String getThreadName() {
		return threadName;
	}
	

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
