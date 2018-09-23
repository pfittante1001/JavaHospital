package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SurgeonTest {
	
	@Test
	public void IsSurgeonOPerating(){
		
		//Arrange
		Surgeon testSurgeon = new Surgeon("Bob", 0, "Brain", true);
		//Action
		Boolean operating = testSurgeon.GetOperatingStatus();
		//Assert
		assertThat(operating, is(true));
	}
	@Test
	public void shouldBeAbleMake90000() {
		// Arrange
		Surgeon testSurgeon = new Surgeon("Bob", 0, "Brain", true);
		// Act
		int testPay = testSurgeon.calculatePay();
		// Assert
		assertThat(testPay, is(60000));
	}
	

}
