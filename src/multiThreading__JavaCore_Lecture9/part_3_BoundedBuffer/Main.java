package multiThreading__JavaCore_Lecture9.part_3_BoundedBuffer;

public class Main {

	public static void main(String[] args) {
		SingleElementBuffer buffer = new SingleElementBuffer();
		
		new Thread(new Producer(1, 1000, buffer)).start();;
		new Thread(new Consumer(buffer)).start();
	}

}
