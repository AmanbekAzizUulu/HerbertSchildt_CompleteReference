package multithreading_unSynchronized;

public class Main {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		
		Caller object_1 = new Caller(target, "Wellcome ");
		Caller object_2 = new Caller(target, "to Unsynchronized ");
		Caller object_3 = new Caller(target, "world");
		
		try {
			object_1.getMyThread().join();
			object_2.getMyThread().join();;
			object_3.getMyThread().join();
		} catch (InterruptedException e) {
			System.out.println("Thread is terminated: " + e);
		}
	}

}
