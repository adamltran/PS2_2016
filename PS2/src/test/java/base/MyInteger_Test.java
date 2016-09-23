package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

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

	// tests for isEven()
	@Test
	public void isEvenTestTrue() {
		int value = 4;
		MyInteger test = new MyInteger(value);
		boolean result = test.isEven();
		assertEquals(true, result);
	}
	@Test
	public void isEvenTestFalse() {
		int value = 5;
		MyInteger test = new MyInteger(value);
		boolean result = test.isEven();
		assertEquals(false, result);
	}
	
	//tests for isOdd()
	@Test
	public void isOddTestTrue() {
		int value = 5;
		MyInteger test = new MyInteger(value);
		boolean result = test.isOdd();
		assertEquals(true, result);	
	}
	
	@Test
	public void isOddTestFalse() {
		int value = 4;
		MyInteger test = new MyInteger(value);
		boolean result = test.isOdd();
		assertEquals(false, result);
	}

	//tests for isPrime()
	@Test
	public void isPrimeTestTrue() {
		int value = 13;
		MyInteger test = new MyInteger(value);
		boolean result = test.isPrime();
		assertEquals(true, result);
	}
	
	@Test
	public void isPrimeTestFalse() {
		int value = 12;
		MyInteger test = new MyInteger(value);
		boolean result = test.isPrime();
		assertEquals(false, result);
	}
	
	//tests for isEven(int)
	@Test
	public void isEvenIntTestTrue() {
		boolean result = MyInteger.isEven(6);
		assertEquals(true, result);
	}
	
	@Test
	public void isEvenIntTestFalse() {
		boolean result = MyInteger.isEven(7);
		assertEquals(false, result);
	}
	
	//tests for isOdd(int)
	@Test
	public void isOddIntTestTrue() {
		boolean result = MyInteger.isOdd(7);
		assertEquals(true, result);
	}
	
	@Test
	public void isOddIntTestFalse() {
		boolean result = MyInteger.isOdd(8);
		assertEquals(false, result);
	}
	
	//tests for isPrime(int)
	@Test
	public void isPrimeIntTestTrue() {
		boolean result = MyInteger.isPrime(13);
		assertEquals(true, result);
	}
	
	@Test
	public void isPrimeIntTestFalse() {
		boolean result = MyInteger.isPrime(14);
		assertEquals(false, result);
	}
	
	//tests for isEven(MyInteger)
	@Test
	public void isEvenObjectTestTrue() {
		MyInteger myint = new MyInteger(40);
		boolean actual = MyInteger.isEven(myint);
		boolean expect = true;
		assertEquals(actual, expect);
	}
	
	@Test
	public void isEvenObjectTestFalse() {
		MyInteger myint = new MyInteger(41);
		boolean actual = MyInteger.isEven(myint);
		boolean expect = false;
		assertEquals(actual, expect);
	}
	
	//tests for isOdd(MyInteger)
	@Test
	public void isOddObjectTestTrue() {
		MyInteger myint = new MyInteger(41);
		boolean actual = MyInteger.isOdd(myint);
		boolean expect = true;
		assertEquals(actual, expect);
	}
	
	@Test
	public void isOddObjectTestFalse() {
		MyInteger myint = new MyInteger(40);
		boolean actual = MyInteger.isOdd(myint);
		boolean expect = false;
		assertEquals(actual, expect);
	}
	
	//tests for isPrime(MyInteger)
	@Test
	public void isPrimeObjectTestTrue() {
		MyInteger myint = new MyInteger(23);
		boolean actual = MyInteger.isPrime(myint);
		boolean expect = true;
		assertEquals(actual, expect);
	}
	
	@Test
	public void isPrimeObjectTestFalse() {
		MyInteger myint = new MyInteger(20);
		boolean actual = MyInteger.isPrime(myint);
		boolean expect = false;
		assertEquals(actual, expect);
	}
	
	
	//Tests for equals(int)
	@Test
	public void equalsIntTestTrue() {
		int value = 19;
		MyInteger myint = new MyInteger(value);
		boolean result = myint.equals(19);
		assertEquals(true, result);
	}
	
	@Test
	public void equalsIntTestFalse() {
		int value = 19;
		MyInteger myint = new MyInteger(value);
		boolean result = myint.equals(18);
		assertEquals(false, result);
	}
	
	//Tests for equals(MyInteger)
	@Test
	public void equalsObjectTestTrue() {
		MyInteger myint = new MyInteger(130);
		MyInteger myint2 = new MyInteger(130);
		boolean actual = myint.equals(myint2);
		boolean expect = true;
		assertEquals(actual, expect);
	}
	
	@Test
	public void equalsObjectTestFalse() {
		MyInteger myint = new MyInteger(130);
		MyInteger myint2 = new MyInteger(131);
		boolean actual = myint.equals(myint2);
		boolean expect = false;
		assertEquals(actual, expect);
	}
	
}

