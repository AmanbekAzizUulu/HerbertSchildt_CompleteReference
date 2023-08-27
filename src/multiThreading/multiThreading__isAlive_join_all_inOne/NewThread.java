package multiThreading.multiThreading__isAlive_join_all_inOne;



public class NewThread implements Runnable {
	private Thread thread;
	private String threadName;

	public NewThread(String threadName) {
		this.setThreadName(threadName);
		this.setTread(new Thread(this, this.getThreadName()));
		this.getThread().start();
		System.out.println("Sub Thread " + this.getThread() + " is initialized");
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("thread: " + this.getThread() + " num: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getThread() + " is terminated");
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Thread getThread() {
		return thread;
	}

	public void setTread(Thread tread) {
		this.thread = tread;
	}

}
