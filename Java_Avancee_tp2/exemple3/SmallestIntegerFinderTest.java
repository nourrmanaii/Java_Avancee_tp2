package exemple3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

	@Test
	void testIsSmallInteger() {
		// Arrange
		int[] tableau = { 1, 2, 3, 4, 5 };

		// Act
		int min = SmallestIntegerFinder.findSmallestInt(tableau);

		// Assert
		assertEquals(min, 1);
	}

}
