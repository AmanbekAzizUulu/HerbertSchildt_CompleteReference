package linkedList;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//создать связной список
		LinkedList <String> linkedList = new LinkedList<String>();
		//ввести жлементы в связной список
		linkedList.add("F");
		linkedList.add("B");
		linkedList.add("D");
		linkedList.add("E");
		//добавить первый и последний элементы
		linkedList.addLast("Z");
		linkedList.addFirst("A");
		//введение элемента в определенное место списка
		linkedList.add(1, "A2");
		
		System.out.println("Initial state of LinkedList: " + linkedList);
		//удаление элементов по значению и по индексу
		linkedList.remove("F");
		linkedList.remove(2);
		
		System.out.println("LinkedList after removing items: " + linkedList);
		//удаление первого и последнего элементов
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println("LinkedList after removing first and last items: " + linkedList);
		//получение некоторого элемента по индексу и замена некоторого элемента по индексу
		String tempVariable = linkedList.get(2);
		linkedList.set(1, "replacement: " + tempVariable  );
		
		System.out.println("LinkedList after all changes: " + linkedList);
	}
}
