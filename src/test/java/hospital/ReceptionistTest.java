package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void GetIsOnThePhone(){
		
		//Arrange
		Receptionist testReceptionist = new Receptionist("Mary", 44, true);
		//Action
		Boolean isPhone = testReceptionist.IsTalking();
		//Assert
		assertThat(isPhone, is(true));
	}
	@Test
	public void shouldBeAbleMake45000() {
		// Arrange
		Receptionist testReceptionist = new Receptionist("Mary", 44, true);
		// Act
		int testPay = testReceptionist.calculatePay();
		// Assert
		assertThat(testPay, is(45000));
	}

}
