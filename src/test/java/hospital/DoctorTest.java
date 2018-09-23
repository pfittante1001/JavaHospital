package hospital;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void doctorShouldHaveName(){
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 0, "Brain");
		//Act
		String name = testDoctor.GetName();
		//Assert
		assertThat(name, is("Bob"));
		
	}

	@Test
	public void doctorShouldHaveNumber() {
		
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 0, "Brain");
		//Act
		int number = testDoctor.GetNumber();
		//Assert
		assertThat(number, is(0));
	}
	
	@Test
	public void doctorShouldHaveSpeciatly() {
		
		//Arrange
		Doctor testDoctor = new Doctor("Bob", 0, "Brain");
		//Act
		String speciality = testDoctor.GetSpeciality();
		//Assert
		assertThat(speciality, is("Brain"));
	}
	@Test
	public void shouldBeAbleMake90000() {
		// Arrange
		Doctor testDoctor = new Doctor("Bob", 0, "Brain");
		// Act
		int testPay = testDoctor.calculatePay();
		// Assert
		assertThat(testPay, is(90000));
	}
	@Test
	public void doctorShouldCareForPatient() {
		
		//Arrange
		Patient testPatient = new Patient();
		Doctor testDoctor = new Doctor("Bob", 0, "Brain");
		
		//Action
		int testHealthBefore = testPatient.getHealth();
		testDoctor.careForPatient(testPatient); 
		int testHealthAfter = testPatient.getHealth();
		
		//Assert
		assertThat(testHealthAfter, is(greaterThan(testHealthBefore)));
		
	}
}
