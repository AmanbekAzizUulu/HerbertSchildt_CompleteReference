package Inheritance_1.copy;

public class BoxWeight extends Box {
	double weight;

	BoxWeight(BoxWeight object) {
		super(object);
		weight = object.weight;
	}

	//конструктор, применяемый при указании всех параметров
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	// конструктор, применяемый при указании всех параметров
	BoxWeight() {
		super();
		weight = -1;
	}
	
	//конструктор, применяемый при создании куба	
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
	
	
}
