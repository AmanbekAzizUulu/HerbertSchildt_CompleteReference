package static__keyword;

public class Static__keyword {
	private static int a = 42;
	private static int b = 99;
	
	static void callMe() {
		System.out.println("a = " + a);
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Static__keyword.b = b;
	}
}
