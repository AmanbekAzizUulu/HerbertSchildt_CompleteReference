package returnValues;

public class Main {
	public static void main(String args[]) {
		Test object_1 = new Test(2);
		Test object_2;
		
		object_2 = object_1.increaseByTen();
		System.out.println("object_1.a: " + object_1.getA());
		System.out.println("object_2.a: " + object_2.getA());
		
		object_2 = object_2.increaseByTen();
		System.out.println("object_2.a after the first increase: " + object_2.getA());
	}
}
