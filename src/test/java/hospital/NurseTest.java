package hospital;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

public class NurseTest {
	
	@Test
	public void nurseShouldHaveName(){
		//Arrange
		Nurse testNurse = new Nurse("Mary", 4);
		//Action
		String name = testNurse.GetName();
		//Arrange
		assertThat(name, is("Mary"));
		
	}
	@Test
	public void nurseShouldHaveNumber(){
		//Arrange
		Nurse testNurse = new Nurse("Mary", 4);
		//Action
		int number = testNurse.GetNumber();
		//Arrange
		assertThat(number, is(4));
		
	}
	@Test
	public void shouldBeAbleMake50000() {
		// Arrange
		Nurse testNurse = new Nurse("Mary", 4);
		// Act
		int testPay = testNurse.calculatePay();
		// Assert
		assertThat(testPay, is(50000));
	}

	@Test
	public void nurseShouldCareForPatient() {
		
		//Arrange
		Patient testPatient = new Patient();
		Nurse testNurse = new Nurse("Mary", 4);
		
		//Action
		
		int healthBefore = testPatient.getHealth();
		testNurse.careForPatient(testPatient);
		int healthAfter = testPatient.getHealth();
		
		//Assert
		assertThat(healthAfter, is(greaterThan(healthBefore)));

		
	}

}
