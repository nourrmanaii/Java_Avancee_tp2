package exemple_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArraysManagerTest {

	@Test
	void testIsSommeArray() {
		// Arrange
		int[] tableau = { 1, 2, 3, 4, 5 };

		// Act
		int result = ArraysManager.squareSum(tableau);

		// Assert
		assertEquals(result, 55);
	}

}
