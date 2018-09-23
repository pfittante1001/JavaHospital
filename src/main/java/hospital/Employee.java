package hospital;

public abstract class Employee {

	private String name;
	private int number;
	
	Employee(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public abstract int calculatePay();
	
	public String GetName() {
		return name;
	}
	
	public int GetNumber() {
		return number;
	}
}
