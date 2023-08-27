package multiThreading_synchronized;

public class Main {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		
		Caller object_1 = new Caller(target, "Wellcome");
		object_1.getMyThread().setPriority(10);
		Caller object_2 = new Caller(target, "to");
		object_2.getMyThread().setPriority(9);
		Caller object_3 = new Caller(target, "synchronized world!");
		object_3.getMyThread().setPriority(8);
		
		try {
			object_1.getMyThread().join();
			object_2.getMyThread().join();
			object_3.getMyThread().join();
		} catch (InterruptedException e) {
			System.out.println("Thread is terminated: " + e);
		}
		 
	}

}
