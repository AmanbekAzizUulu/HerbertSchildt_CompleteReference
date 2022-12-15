package try__catch;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		Random randomizer = new Random();
//		int a = 0;
//		int b = 0;
//		int c = 0;

//		for (int i = 0; i < 10; i++) {
//			try {
//				b = randomizer.nextInt();
//				c = randomizer.nextInt();
//				a = 12345 / (b / c);
//			} catch (ArithmeticException aE) {
//				System.out.println("Dividing by ZERO!");
//				a = 0;
//			}
//			System.out.println("a " + a);
//		}
		/* Можно выводить в консоль саму ошибку */
//		for (int i = 0; i < 10; i++) {
//			try {
//				b = randomizer.nextInt();
//				c = randomizer.nextInt();
//				a = 12345 / (b / c);
//			} catch (ArithmeticException aE) {
//				System.out.println("Exception: " + aE);
//				a = 0;
//			}
//			System.out.println("a " + a);
//		}
		/* Несколько операторов try-catch */
//		try {
//			int a = args.length;//0
//			System.out.println("a = " + a);
//			int b = 42 / a;
//			int c[] = {1};
//			c[42] = 99;
//			
//		} catch (ArithmeticException ae) {
//			System.out.println("Exception " + ae);
//		} catch (ArrayIndexOutOfBoundsException aioob) {
//			System.out.println("Exception " + aioob);
//		}
//		System.out.println("This message prints after \"try~catch\" block");
//	}

//		try {
//			int a = 7;
//			System.out.println("a = " + a);
//			int b = 42 / a;
//			int c[] = { 1 };
//			c[42] = 99;
//
//		} catch (ArithmeticException ae) {
//			System.out.println("Exception " + ae);
//		} catch (ArrayIndexOutOfBoundsException aioob) {
//			System.out.println("Exception " + aioob);
//		}
//		System.out.println("This message prints after \"try~catch\" block");

		/*
		 * Эта программа содержит ошибку. В последовательности операторов catch подкласс
		 * исключений должен быть указан перед его суперклассом, иначе это приведет к
		 * недостижимому коду и ошибке во время компиляции.
		 */
//		try {
//			int a = 0;
//			int b = 42 / a;
//		} catch (Exception e) {
//			System.out.println("Interception of Common Class Exceptions");
//		} catch (ArithmeticException ae) {
//			/*
//			 * Данный оператор catch вообще не будет достигнут так как подкласс
//			 * ArithmeticException является производным класса Exception
//			 */
//			System.out.println("This code is completely unreachable.");
//		}
		/*
		 * Чтобы исправить это положение, придется изменить порядок следова­ ния
		 * операторов catch.
		 */
		
//		try {
//			int a = 2;
//			
//			int b = 42 / a;
//			
//			System.out.println("a = " + a );
//			try {
//				if (a == 1) {
//					a = a /(a - a);
//				}
//				if (a == 2) {
//					int c[] = {1};
//					c[1] = 2;
//				}
//			} catch (ArrayIndexOutOfBoundsException aioob) {
//				System.out.println("Inner try_catch block");
//				System.out.println("Exception: " + aioob);
//			}
//					
//		} catch (ArithmeticException ae) {
//			System.out.println("Exception: " + ae);
//		}
		
/*Не очевидная вложенность операторов try_catch*/
		try {
			int a = 2;
			int b = 42 / a;
			System.out.println("a = " + a );
			nestedTryCatch(a);
		} catch (ArithmeticException ae) {
			System.out.println("Exception: " + ae);
		}

	}
	public static void nestedTryCatch(int a){
		try {
			if (a == 1) {
				a = a /(a - a);
			}
			if (a == 2) {
				int c[] = {1};
				c[1] = 2;
			}
		} catch (ArrayIndexOutOfBoundsException aioob) {
			System.out.println("Inner try_catch block");
			System.out.println("Exception: " + aioob);
		}
	}
}
