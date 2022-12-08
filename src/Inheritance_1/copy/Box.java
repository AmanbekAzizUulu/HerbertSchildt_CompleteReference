package Inheritance_1.copy;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	Box(Box object) {
		width = object.width;
		height = object.height;
		depth = object.depth;
	}
	
	Box(double width, double height, double depth) {
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
//	значение -1 служит для обозначения неинициализированного параллелепипеда
	Box() {
		this.width = -1;
		this.depth = -1;
		this.width = -1;
	}
	
	Box(double length){
		this.width = this.depth = this.height = length;
	}
	
	double volume() {
		return this.width * this.depth * this.height;
	}
}
