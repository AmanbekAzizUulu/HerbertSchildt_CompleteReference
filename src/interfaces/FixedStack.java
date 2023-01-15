package interfaces;

public class FixedStack implements InStack {

	private int stack[];
	private int toss;
	
	public FixedStack(int size) {
		this.stack = new int[size];
		this.toss = -1;
	}
	
	public void push(int item) {
		if (toss == stack.length - 1) {
			System.out.println("Stack is full");
		}else {
			stack[++toss] = item;
		}
	}

	public int pop() {
		System.out.println("fixed stack");
		if (toss < 0) {
			System.out.println("Stack is not full");
			return 0;
		}else {
			return stack[toss --];
		}
		
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int stack[]) {
		this.stack = stack;
	}

	
	public int getTos() {
		return toss;
	}

	public void setTos(int tos) {
		this.toss = tos;
	}

}
