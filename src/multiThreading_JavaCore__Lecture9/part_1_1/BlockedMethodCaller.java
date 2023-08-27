package multiThreading_JavaCore__Lecture9.part_1_1;

public class BlockedMethodCaller implements Runnable{
	private final BlockedSetExample referenceKeeper;
	private final int k;
	
	public BlockedMethodCaller( BlockedSetExample referenceKeeper, int k) {
		this.referenceKeeper = referenceKeeper;
		this.k = k;
	}
	
	
	
	@Override
	public void run() {
		try {
			this.getReferenceKeeper().threadInputOutputIndicator(this.getK());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	public BlockedSetExample getReferenceKeeper() {
		return referenceKeeper;
	}
	

	public int getK() {
		return k;
	}

}
