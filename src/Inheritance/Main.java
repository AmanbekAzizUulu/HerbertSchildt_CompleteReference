package Inheritance;

public class Main {

	public static void main(String[] args) {
		BoxWeight mybox_1 = new BoxWeight(10, 0.00134, 32, 34);
		BoxWeight mybox_2 = new BoxWeight(2, 1.324, 4, 3);
		
		double volume;
		
		volume = mybox_1.volume();
		System.out.println("Volume of \"mybox_1\" equals to: "+ volume);
		System.out.println("Weight of \"mybox_1\" equals to: " + mybox_1.weight);
		System.out.println("");
		
		volume = mybox_2.volume();
		System.out.println("Volume of \"mybox_2\" equals to: "+ volume);
		System.out.println("Weight of \"mybox_2\" equals to: " + mybox_2.weight);
		System.out.println("");		
	}

}
