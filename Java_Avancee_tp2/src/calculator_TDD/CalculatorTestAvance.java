package src.calculator_TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTestAvance {

	Calculator calculatorUnderTest;

	@BeforeEach
	public void initCalculator() {
		System.out.println("Appel avant chaque test");
		calculatorUnderTest = new Calculator();
	}

	@AfterEach
	public void undefCalculator() {
		System.out.println("Appel après chaque test");
		calculatorUnderTest = null;
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 42, 1011, 5089 })
	public void multiply_shouldReturnZero(int arg) {
		// Arrange -- Tout est prêt !

		// Act -- Multiplier par zéro
		int actualResult = calculatorUnderTest.multiply(arg, 0);

		// Assert -- ça vaut toujours zéro !
		assertEquals(0, actualResult);
	}

	@ParameterizedTest
	@CsvSource({ "1,1,2", "2,3,5", "42,57,99" })
	public void multiply_shouldReturnTheSum(int arg1, int arg2, int execptResult) {
		// Arrange -- Tout est prêt !

		// Act -- Multiplier par zéro
		int actualResult = calculatorUnderTest.add(arg1, arg2);

		// Assert
		assertEquals(execptResult, actualResult);
	}

}
