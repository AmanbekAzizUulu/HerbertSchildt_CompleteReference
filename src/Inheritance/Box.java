package Inheritance;


public class Box {
	double width;
	double height;
	double depth;
	
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
