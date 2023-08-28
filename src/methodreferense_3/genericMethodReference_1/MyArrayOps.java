package methodreferense_3.genericMethodReference_1;

public class MyArrayOps {
	/**
	 * 
	 * A static method that returns the number of elements in the array that are equal to the specified value.
	 * 
	 */
	public static <T> int countMatching(T[] vals, T v) {
		int count = 0;
		
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == v) {
				count ++;
			}
		}
		return count;
	}
}
