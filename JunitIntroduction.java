/*
 * Programmer : Hemant Choudhari
 * This is the code examples show I am familiar with Selenium Juni. 
 * Learning by myself from Udemy.com to imporve my skills regarding automation using java and selenium
 * date: 09/10/2017
 */

package junit_framework_test_case;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Execute Before Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed After");
	}

	@Test 
	public void test1() {
		System.out.println("Executed test 1");
	}
	
	@Test 
	public void test2() {
		System.out.println("Executed test 2");
	}
}
