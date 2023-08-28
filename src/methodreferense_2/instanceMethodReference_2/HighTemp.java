package methodreferense_2.instanceMethodReference_2;

public class HighTemp {
	private int highTemp;

	public HighTemp (int highTemp) {
		this.highTemp = highTemp;
	}

	/**
	 * 
	 * @param ht2
	 * @return Return true if the invoking HighTemp object contains the same
	 *         temperature as ht2.
	 */
	public boolean sameTemp(HighTemp ht2) {
		return this.highTemp == ht2.highTemp;
	}

	/**
	 * 
	 * @param ht2
	 * @return Return true if the invoking HighTemp object contains a
	 *         temperature lower than that of ht2.
	 */
	public boolean lessThenTemp(HighTemp ht2) {
		return this.highTemp < ht2.highTemp;
	}

	public int getHighTemp() {
		return highTemp;
	}

	public void setHighTemp(int highTemp) {
		this.highTemp = highTemp;
	}

}
