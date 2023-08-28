package methodreferense_1.staticMethodReference;

public class MyStringOps {
	/**
	 * A static method that reverses the order of characters.
	 * 
	 * @param str
	 * @return {@code str} with reversed order of characters
	 */
	public static String strReverse(String str) {
		String result = "";
		int	   i;

		for (i = str.length () - 1; i >= 0; i --) {
			result += str.charAt (i);
		}
		return result;
	}
	
	/**
	 *	A static method that removes spaces from the given string.
	 * 
	 * @param str
	 * @return {@code str} without spaces 
	 */
	public static String strWithoutWhiteSpace(String str) {
		String result = "";

		for (int i = 0; i < str.length (); i ++) {
			if (str.charAt (i) == ' ') {
				continue;
			}
			result += str.charAt (i);
		}
		return result;
	}

	/**
	 *	A static method that removes the letter 'R' from the given string.
	 * 
	 * @param str
	 * @return {@code str} string without 'R'
	 */
	public static String strWithoutCharacter_R(String str) {
		String result = "";

		for (int i = 0; i < str.length (); i ++) {
			if (str.charAt (i) == 'R' || str.charAt (i) == 'r') {
				continue;
			}
			result += str.charAt (i);
		}
		return result;
	}
}
