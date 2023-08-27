package multiThreading_JavaCore__Lecture9.part_1_1;

public class BlockedSetExample {

	public static void main(String[] args) {
		BlockedSetExample referenceKeeper = new BlockedSetExample();
		for (int k = 0; k < 5; k++) {
			new Thread(new BlockedMethodCaller(referenceKeeper, k)).start();
		}
	}

	synchronized public void threadInputOutputIndicator(int i) throws InterruptedException {
		{
			Thread.sleep(1000);
		}
		System.out.println(" + INPUT\t" + i);
		{
			Thread.sleep(1000);
		}
		System.out.println(" - OUTPUT\t" + i);
	}
}
