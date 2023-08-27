package multiThreading__JavaCore_Lecture9.part_3_BoundedBuffer;

import static java.lang.System.out;

public class Producer implements Runnable{
	private int startValue;
	private final int sleepingPeriod;
	private final SingleElementBuffer buffer;
	
	public Producer(int startValue, int sleepingPeriod, SingleElementBuffer buffer) {
		this.setStartValue(startValue);
		this.sleepingPeriod = sleepingPeriod;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while (true) {
			out.println(this.getStartValue() + " produced");
			try {
				this.getBuffer().put(startValue ++ );//сначала помещает значение а потом увеличивает его
				Thread.sleep(this.getSleepiPeriod());
			} catch (InterruptedException e) {
				out.println(Thread.currentThread().getName());
				e.printStackTrace();
			}
		}
	} 

	public int getStartValue() {
		return startValue;
	}

	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public int getSleepiPeriod() {
		return sleepingPeriod;
	}

	public SingleElementBuffer getBuffer() {
		return buffer;
	}
	
}
