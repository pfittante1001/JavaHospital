package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
public class JanitorTest {

	@Test
	public void GetIsSweeping(){
		
		//Arrange
		Janitor testJanitor = new Janitor("Mary", 44, true);
		//Action
		Boolean isSweeping = testJanitor.IsSweeping();
		//Assert
		assertThat(isSweeping, is(true));
	}
	@Test
	public void shouldBeAbleMake45000() {
		// Arrange
		Janitor testJanitor = new Janitor("Mary", 44, true);
		// Act
		int testPay = testJanitor.calculatePay();
		// Assert
		assertThat(testPay, is(45000));
	}
	
	
	
	
}
