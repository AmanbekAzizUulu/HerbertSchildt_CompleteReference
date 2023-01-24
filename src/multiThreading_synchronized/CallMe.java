package multiThreading_synchronized;

public class CallMe{
	public void call(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("Thread is terminated: "+ e);
		}
		System.out.println("]");
	}
}
