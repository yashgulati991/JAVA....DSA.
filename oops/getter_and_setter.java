package oops;

public class getter_and_setter {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();
		System.out.println();
//		System.out.println(b1.setId(12));
//		System.out.println(b1.getId());

	}

}

class BankAccount {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
