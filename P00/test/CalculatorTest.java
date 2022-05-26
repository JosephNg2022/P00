import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		// Act
		int actual = cal.add(a, b);
		// Assert
		int expected = 9999;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		// Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		// Act
		int actual = cal.subtract(a, b);
		// Assert
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiple() {
		// Arrange
		int a = 5;
		int b = 10;
		Calculator cal = new Calculator();
		// Act
		int actual = cal.multiple(a, b);
		// Assert
		int expected = 50;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivide() {
		// Arrange
		double a = 5;
		double b = 10;
		Calculator cal = new Calculator();
		// Act
		double actual = cal.divide(b, a);
		// Assert
		double expected = 2;
		int error = 2;
		assertEquals(actual, expected, error);
	}
}
