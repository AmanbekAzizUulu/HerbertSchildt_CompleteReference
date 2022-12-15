package listIterator__iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		//создать списочный массив
		ArrayList<String> arrayList = new ArrayList<String>();
		//ввести элементы в списочный массив
		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		//использовать итераторы для вывода содержимого 
		//списочного массива arrayList
		System.out.println("Initial state of arrayList: ");
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\telement "  + element);
		}
		
		//видоизменить перебираемые объекты
		ListIterator<String> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			String element = listIterator.next();
			listIterator.set(element + "+");
		}
		System.out.println();
		
		//вывод измененного содержания массива
		System.out.println("ArrayList after modification:  ");
		iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\telement "  + element);
		}
		System.out.println();
		
		//отображение списка в обратном порядке
		System.out.println("ArrayList in reverse order:  ");
		while (listIterator.hasPrevious()) {
			String element = listIterator.previous();
			System.out.println("\telement "  + element);
		}
		System.out.println();

	}
}
