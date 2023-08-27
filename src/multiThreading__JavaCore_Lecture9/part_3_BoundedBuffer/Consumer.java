package multiThreading__JavaCore_Lecture9.part_3_BoundedBuffer;

import static java.lang.System.out;

public class Consumer implements Runnable{
	private final SingleElementBuffer buffer;
	
	public Consumer(SingleElementBuffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				int element;
				element = this.getBuffer().get();
				out.println(element + " consumed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public SingleElementBuffer getBuffer() {
		return buffer;
	}

}
