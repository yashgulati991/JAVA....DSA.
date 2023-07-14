package oops;

public class abstract_keyowrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h = new Horse();
		chicken c = new chicken();
		c.walk();
	}

}

abstract class Animal {
	String color;

	Animal() {
		color = "Peach";
	}

	void eat() {
		System.out.println("Animal eats");
	}

	abstract void walk();

}

class Horse extends Animal {
	void changeColor() {
		color = "Brown";
	}

	@Override
	void walk() {
		System.out.println("walks on 4 legs ");
	}
}

class chicken extends Animal {
	@Override
	void walk() {
		System.out.println("Walks on 2 legs");
	}
}