import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * yournumber9, 26 May 2022 11:18:32 am
 */

/**
 * @author yournumber9
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
		 
		
		int expected = 5555;
		assertEquals (expected, actual);
		assertNotEquals (expected, 10);
		assertTrue (a >= 0 && a <= 9999);
		assertTrue (b >= 0 && b <= 9999);
		
		}
	@Test
	public void testSubtract() {
		int a = 100;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.substract (a, b); 
			 
		int expected = 98;
		assertEquals (expected, actual);
		assertNotEquals (expected, 10);
		assertTrue (a >= 0 && a <= 9999);
		assertTrue (b >= 0 && b <= 9999);
		
		}
	@Test
	public void testMultiple() {
		int a = 100;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple (a, b); 
			 
		int expected = 200;
		assertEquals (expected, actual);
		assertNotEquals (expected, 10);
		assertTrue (a >= 0 && a <= 9999);
		assertTrue (b >= 0 && b <= 9999);
		
		}
	@Test
	public void testDivide() {
		int a = 100;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide (a, b); 
			 
		int expected = 50;
		assertEquals (expected, actual);
		assertNotEquals (expected, 10);
		
		
		}


}
