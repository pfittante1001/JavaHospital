package hospital;

public class Receptionist extends Employee {

	private Boolean status;

	
	public Receptionist(String name, int number, boolean status) {
		super(name, number);

		this.status = status;
	}

	public Boolean IsTalking() {

		return status;
	}
	
	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 45000;
	}

}
