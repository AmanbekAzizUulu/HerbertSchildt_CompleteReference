package interfaces;

public class DynamicStack implements InStack{
	private int stack[];
	private int toss;
	
	public DynamicStack(int size) {
		this.stack = new int[size];
		toss = -1;
	}
	
	//Реализована логика работы динамического массива
	//при необходимости его размер увеличивается в некоторое количество раз
	public void push(int item) {
		if (toss == stack.length - 1) {
			int tempArray[] = new int[stack.length * 2];
			
			for (int i = 0; i < stack.length; i++) {
				tempArray[i] = stack[i];
			}
			stack = tempArray;
			stack[++toss] = item;
		}else {
			stack[++toss] = item;
		}
	}

	public int pop() {
		System.out.println("dynamic stack");
		if (toss < 0) {
			System.out.println("Stack is not full");
			return 0;
		}else {
			return stack[toss--];
		}
		
	}

	public int getToss() {
		return toss;
	}

	public void setToss(int toss) {
		this.toss = toss;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int stack[]) {
		this.stack = stack;
	}

}
