
package methodreferense_3.genericMethodReference_1;


public class GenericMethodRefDemo {

	public static void main(String [] args) {
		Integer [] vals	   = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 2, 3, 4, 4, 5, 6, 1, 1, 2, 3, 3, 2, 2, 5, 4, 6 };
		String []  strVals = { "four", "one", "four", "three", "three", "two", "four", "three", "three", "three",
		        "four", "five", "six", "seven", "six", "six", "six", };

		int		   count;

		count = myOp (MyArrayOps::<Integer>countMatching, vals, 4);
		System.out.println ("The number of elements containing '4' in 'vals':" + count);

		count = myOp (MyArrayOps::<String>countMatching, strVals, "four");
		System.out.println ("The number of elements containing 'four' in 'strVals':" + count);
	}


	public static <T> int myOp(MyFunc <T> f, T [] vals, T v) {
		return f.func (vals, v);
	}
}
