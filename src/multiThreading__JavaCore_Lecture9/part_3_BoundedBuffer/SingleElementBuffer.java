package multiThreading__JavaCore_Lecture9.part_3_BoundedBuffer;

public class SingleElementBuffer {
	private Integer element;

	public synchronized void put(Integer newElement) throws InterruptedException {
		while (this.element != null ) {
			this.wait();
		}
		this.setElement(newElement);
		this.notifyAll();
	}
	
	public synchronized Integer get() throws InterruptedException {
		while (this.element == null) {
			this.wait();
		}
		int result = this.getElement(); //автораспаковка 
		this.setElement(null);
		this.notifyAll();
		return result;
	}
	
	/*Getters and Setters*/
	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}
}
