
package methodreferense_3.genericMethodReference_2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MethodRefDemod {

	public static Integer compareMyCollection(MyClass a, MyClass b) {
		return a.getValue ().compareTo (b.getValue ());
	}


//	Обратите внимание в программе, что в самом классе MyClass никаких
//	собственных методов сравнения не определено и не реализован интер­
//	фейс Comparator. Тем не менее, максимальное значение в списке элементов
//	MyClass по-прежнему можно получить, вызывая метод max () , т.к. в классе
//	UseMethodRef определен статический метод compareMC () , который совме­
//	стим с методом compare (), определенным в Comparator. Следовательно,
//	явно реализовывать и создавать экземпляр реализации Comparator не при­
//	дется.
	
	public static void main(String [] args) {
		List <MyClass> list = new ArrayList <MyClass> ();

		list.add (new MyClass (205));
		list.add (new MyClass ( - 50));
		list.add (new MyClass (150));
		list.add (new MyClass (5));
		list.add (new MyClass (160));
		list.add (new MyClass (340));

		MyClass myClass = Collections.max (list, MethodRefDemod::compareMyCollection);
		System.out.println ("max value of the collection: " + myClass.getValue ());
	}
}
