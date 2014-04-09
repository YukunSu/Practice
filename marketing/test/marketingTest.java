package test;

import static org.junit.Assert.*;
import org.junit.Test;
import src.marketing;

public class marketingTest {

	public marketing marketing = new marketing();
	
	@Test
	public void test1() {
		String[] compete = {"1 4","2","3","0",""}; 
		long actual = marketing.howMany(compete);
		long expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		String[] compete = {"1","2","0"}; 
		long actual = marketing.howMany(compete);
		long expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		String[] compete = {"1","2","3","0","0 5","1"}; 
		long actual = marketing.howMany(compete);
		long expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		String[] compete = {"","","","","","","","","","",
							"","","","","","","","","","",
							"","","","","","","","","",""}; 
		long actual = marketing.howMany(compete);
		long expected = 1073741824;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		String[] compete = {"1","2","3","0","5","6","4"}; 
		long actual = marketing.howMany(compete);
		long expected = -1;
		assertEquals(expected, actual);
	}
}