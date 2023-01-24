package multiThreading_1;

public class Main {
	private final static String THREAD_NAME[] = {
			"FirstThread",
			"SecondThread",
			"ThirdThread",
			"FourthThread",
			"FifthThread"
	};
	
	public static String getThreadName(int order) {
		return THREAD_NAME[order];
	}

	public static void main(String[] args) {
		for (int i = 0; i < THREAD_NAME.length ; i++) {
			new MyThread(getThreadName(i));
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread() + " is terminated");
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread() + " is overed");
	}

}
