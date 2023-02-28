package exemple_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringManagerTest {

	@Test
	void testIsSringReverse() {
		// Arrange
		String str = "hello";

		// Act
		String result = StringManager.StringReverse(str);

		// Assert
		assertEquals(result, "olleh");
	}

}
