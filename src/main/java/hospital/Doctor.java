package hospital;

public class Doctor extends Employee implements MedicalDuties{

	
	private String speciality;

	Doctor(String name, int number, String specialty) {
		super(name, number);
		this.speciality = specialty;
	}
	
	
	public String GetSpeciality() {
		// TODO Auto-generated method stub
		return speciality;
	}

	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 90000;
	}
	
	@Override
	public void careForPatient(Patient testPatient) {
		testPatient.receiveCare();
	}

}
