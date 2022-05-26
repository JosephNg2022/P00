import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class averageTest {

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
	public void testAverage() {
			// Arrange
			int a = 5;
			int b = 4;
			int c = 3;
			int d = 2;
			int e = 1;
			average avg = new average();
			// Act
			int actual = avg.Average(a, b, c, d, e);
			// Assert
			int expected = 3; 
			assertEquals(actual, expected);
	}

}
