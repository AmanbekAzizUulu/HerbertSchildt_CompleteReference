package returnValues;

public class Test {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	Test(int i){
		this.a = i;
	}
	
	public Test increaseByTen() {
		Test temporaryVariable = new Test(this.a + 10);
		return temporaryVariable;
	}
}
