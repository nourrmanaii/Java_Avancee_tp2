package probleme1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testIsValid() {
		// Arrange
		int a = 6;
		int b = 6;
		int c = 6;

		// Act
		int result = Triangle.triangle(a, b, c);

		// Assert
		assertEquals(1, result);
	}

}
