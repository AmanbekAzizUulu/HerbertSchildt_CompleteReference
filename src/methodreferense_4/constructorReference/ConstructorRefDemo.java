
package methodreferense_4.constructorReference;


public class ConstructorRefDemo {

	public static void main(String [] args) {
		MyFunc	myClassConst = MyClass::new;
		MyClass	mc			 = myClassConst.func (100);

		System.out.println ("The value after initialization using a constructor reference: " + mc.getValue ());
	}
}
