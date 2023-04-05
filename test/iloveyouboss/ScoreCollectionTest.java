package iloveyouboss;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void answersArithmeticMeanOfTwoNumbers() {
		// Arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(()->5);
		collection.add(()->7);
		
		// Act
		int actualResult = collection.arithmeticMedian();
		
		// Assert
		assertThat(actualResult, CoreMatchers.equalTo(6));
	}

}
