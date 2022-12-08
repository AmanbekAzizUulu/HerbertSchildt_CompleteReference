package stack;

public class Main {

	public static void main(String[] args) {
		Stack myStack_1 = new Stack();
		Stack myStack_2 = new Stack();
		
		
		for (int i = 0; i < 10; i++) {
			myStack_1.push(i);
		}
		for (int i = 10; i < 20; i++) {
			myStack_2.push(i);
		}
		
		System.out.println("myStack_1 content: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(myStack_1.pop());
		}
		System.out.println("myStack_2 content: ");
		for (int i = 10; i < 20; i++) {
			System.out.println(myStack_2.pop());
		}
	}
}
