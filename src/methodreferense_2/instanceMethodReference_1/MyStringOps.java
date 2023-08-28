package methodreferense_2.instanceMethodReference_1;

public class MyStringOps {
	/**
	 * A static method that reverses the order of characters.
	 * 
	 * @param str
	 * @return {@code str} with reversed order of characters
	 */
	public String strReverse(String str) {
		String result = "";
		int	   i;

		for (i = str.length () - 1; i >= 0; i --) {
			result += str.charAt (i);
		}
		return result;
	}
}
