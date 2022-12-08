package Inheritance_1.copy;

public class Main {

	public static void main(String[] args) {
		BoxWeight myBox_1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight myBox_2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight myBox_3 = new BoxWeight();
		BoxWeight myCube = new BoxWeight(3, 2);
		BoxWeight myBox_copy = new BoxWeight(myBox_1);

		double volume;
		
		volume = myBox_1.volume();
		System.out.println("The Volume of \"myBox_1\" equals to: " + volume);
		System.out.println("Weight of \"myBox_1\" equals to: " + myBox_1.weight);
		System.out.println();
		
		volume = myBox_2.volume();
		System.out.println("The Volume of \"myBox_2\" equals to: " + volume);
		System.out.println("Weight of \"myBox_2\" equals to: " + myBox_2.weight);
		System.out.println();
		
		volume = myBox_3.volume();
		System.out.println("The Volume of \"myBox_3\" equals to: " + volume);
		System.out.println("Weight of \"myBox_3\" equals to: " + myBox_2.weight);
		System.out.println();
		
		volume = myBox_copy.volume();
		System.out.println("The Volume of \"myBox_copy\" equals to: " + volume);
		System.out.println("Weight of \"myBox_copy\" equals to: " + myBox_copy.weight);
		System.out.println();
		
		volume = myCube.volume();
		System.out.println("The Volume of \"myCube\" equals to: " + volume);
		System.out.println("Weight of \"myCube\" equals to: " + myCube.weight);
		System.out.println();
	}

}
