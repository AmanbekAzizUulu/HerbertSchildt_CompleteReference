package interfaces_1;

import java.util.Random;

public class Question implements SharedConstants {
	Random randomizer = new Random();
	public int ask() {
		int probability = (int) (100 * randomizer.nextDouble());
		if (probability < 30) {
			return NO;
		} else if(probability < 60){
			return YES;
		} else if(probability < 75) {
			return LATER;
		} else if (probability < 98) {
			return SOON;
		} else {
			return NEVER;
		}
	}
}
