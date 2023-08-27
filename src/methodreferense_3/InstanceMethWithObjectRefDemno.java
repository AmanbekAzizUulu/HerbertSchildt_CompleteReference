package methodreferense_3;

public class InstanceMethWithObjectRefDemno {
	public static void main(String[] args) {
		int count;
		
		HighTemp[] weekDayHighs_1 = {
				new HighTemp (84),
				new HighTemp (90),
				new HighTemp (85),
				new HighTemp (92),
				new HighTemp (84),
				new HighTemp (80),
				new HighTemp (84),
				new HighTemp (89),
				new HighTemp (90),
				new HighTemp (84),
				new HighTemp (91),
				new HighTemp (84),
				new HighTemp (80),
				new HighTemp (87)
		};
		
		count = counter (weekDayHighs_1, HighTemp::sameTemp, new HighTemp (84));
		System.out.println("The number of days when the highest temperature was 84 degrees: " + count);
		
		HighTemp[] weekDayHighs_2 = {
				new HighTemp (18),
				new HighTemp (18),
				new HighTemp (10),
				new HighTemp (-2),
				new HighTemp (-10),
				new HighTemp (14),
				new HighTemp (20),
				new HighTemp (18)
		};
		
		count = counter (weekDayHighs_2, HighTemp::sameTemp, new HighTemp (18));
		System.out.println("The number of days when the highest temperature was 18 degrees: " + count);
		
		count = counter (weekDayHighs_1, HighTemp::lessThenTemp, new HighTemp (89));
		System.out.println("The number of days when the when the temperature was below  89 degrees: " + count);
		
		count = counter (weekDayHighs_2, HighTemp::lessThenTemp, new HighTemp (14));
		System.out.println("The number of days when the when the temperature was below  14 degrees: " + count);
	}
	
	public static <T> int counter (T[] values, MyFunc <T> function, T v) {
		int count = 0;
		
		for (int i = 0; i < values.length; i++) {
			if (function.func (values[i], v)) {
				count ++;
			}
		}
		return count;
	}
}
