package interfaces;


public class Main {
	public static final int sizeOfFixedStack = 8;
	public static final int sizeOfDynamicStack = 5;
	public static void main(String[] args) {
		//Декларация переменной ссылки типа интерфейса
		InStack myStack;
		
		//Инициализация двух видов массива
		DynamicStack dynamicStack = new DynamicStack(sizeOfDynamicStack);
		FixedStack fixedStack = new FixedStack(sizeOfFixedStack);
		
		//Теперь ссылочная переменная интерфейса имеет адрес
		//объекта фиксированного массива
		myStack = fixedStack;
		for (int i = 0; i < sizeOfFixedStack; i++) {
			myStack.push(i);
		}
		
		//Теперь ссылочная переменная интерфейса имеет адрес
		//объекта динамического массива
		myStack = dynamicStack;
		for (int i = 0; i < sizeOfDynamicStack; i++) {
			myStack.push(i);
		}
		
		myStack = fixedStack;
		System.out.println("Values of fixed stack: ");
		for (int i = 0; i < sizeOfFixedStack; i++) {
			System.out.println(myStack.pop());
		}
		
		myStack = dynamicStack;
		System.out.println("Values of dynamic stack: ");
		for (int i = 0; i < sizeOfDynamicStack; i++) {
			System.out.println(myStack.pop());
		}
		

	}

}
