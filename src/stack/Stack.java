package stack;

//В этом классе определяется целочисленный стэк, где 
//можно хранить до 10 целочисленных значений

public class Stack {
	int stack[]	= new int [10];
	int toss;
	
	//инициализировать вершину стека
	public Stack() {
		toss = -1;
	}

	//разместить элемент в стэке
	public void push(int item) {
		if (toss == 9) {
			System.out.println("Stack is FULL now!");
		}
		else {
			stack[++toss] = item;
		}
	}
	//извлечь элемент из стэка	
	public int pop() {
		if (toss < 0) {
			System.out.println("Stack is EMPTY now!");
			return 0;
		}
		else {
			return stack[toss--];
		}
	}
}
