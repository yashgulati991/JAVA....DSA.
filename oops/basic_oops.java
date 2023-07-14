package oops;

public class basic_oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
//		p1.setColor("blue");
		System.out.println(p1.color);
	}

}

class Pen {
	String color;
	int tip;

	void setColor(String Newcolor) {
		color = Newcolor;
	}

	void newTip(int newTip) {
		tip = newTip;
	}
}

class Student1 {
	String name;
	int id;
	int age;
	float percentage;

	int getPercentage(int phy, int chem, int maths) {
		int percentage = ((phy + chem + maths) / 300) * 100;
		return percentage;
	}
}
