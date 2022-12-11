package try__catch;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random randomizer = new Random();
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				b = randomizer.nextInt();
				c = randomizer.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException aE) {
				System.out.println("Dividing by ZERO!");
				a = 0;
			}
			System.out.println("a " + a); 
		}
	}

}
