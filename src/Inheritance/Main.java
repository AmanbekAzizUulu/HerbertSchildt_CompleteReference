package Inheritance;

public class Main {

	public static void main(String[] args) {
		BoxWeight mybox__boxWeight = new BoxWeight(10, 0.00134, 32, 34);
		Box mybox__box = new Box();
		double volume;
		
		volume = mybox__box.volume();
		System.out.println("Volume of \"mybox_1\" equals to: "+ volume);
		System.out.println("Weight of \"mybox_1\" equals to: " + mybox__boxWeight.weight);
		System.out.println("");
		
		mybox__box = mybox__boxWeight;
		
		volume = mybox__box.volume();
		System.out.println("Volume of \"mybox_2\" equals to: "+ volume);
		System.out.println("");		
	}

}
