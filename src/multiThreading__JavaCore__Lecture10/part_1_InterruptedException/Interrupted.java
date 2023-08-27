package multiThreading__JavaCore__Lecture10.part_1_InterruptedException;


public class Interrupted {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable()
		// --> anonymous Class
		{

			@Override
			public void run() {
				while (true) {
					System.out.println("Thread is interrupted: " + Thread.interrupted());
					for (long i = 0; i < 1_000_000_000L; i++) {}
				}
			}

		});
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();

	}
}