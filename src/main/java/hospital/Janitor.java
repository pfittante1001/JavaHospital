package hospital;

public class Janitor extends Employee {

	private boolean status;

	public Janitor(String name, int number, boolean status) {

		super(name, number);
		this.status = status;
	
	}
	public Boolean IsSweeping() {

		return status;
	}
	
	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 45000;
	}
}
