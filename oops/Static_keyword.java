package oops;

public class Static_keyword {

	public static void main(String[] args) {
//		Students s1 = new Students();
//		s1.schoolName = "Vidya mandir";
//		Students s2 = new Students();
//		System.out.println(s2.schoolName);
		Horse1 h = new Horse1();

	}

}

class Animal1 {
	Animal1() {
		System.out.println("Animal constructor is called");
	}

}

class Horse1 extends Animal1 {

	Horse1() {
		super();
		System.out.println("Horse constructor is called ");
	}
}
//class Students {
//	String name;
//	int roll;
//	static String schoolName;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}}