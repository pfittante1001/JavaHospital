package hospital;

public class Patient {
	
	private int health = 5;

	public int getHealth() {
		return health;
	}

	public void receiveCare() {
		health = health + 2;
	}

}
