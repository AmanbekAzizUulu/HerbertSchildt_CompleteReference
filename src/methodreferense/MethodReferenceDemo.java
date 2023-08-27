package methodreferense;

public class MethodReferenceDemo {

	public static void main(String [] args) {
		String inStr = "The order of characters in this sentence will be reversed.";
		String outStr;

		outStr = stringOp (MyStringOps::strReverse, inStr);

		System.out.println ("Initial String:\n\t" + inStr);
		System.out.println ("Reversed String:\n\t" + outStr);
	}

	public static String stringOp(StringFunc sf, String str) {
		return sf.func (str);
	}
}
