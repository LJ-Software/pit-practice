package org.adrlog.practice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App tester;

	@Before
	/** Fixture */
	public void setUp() {
		tester = new App();
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	@Test /** Test */
	public void testSample() {
		tester.runThings(0, 2147483649L, 0.0, 0.1f);

	}

	@Test
	public void testByte() {
		tester.returnByte();
	}

	@Test
	public void testDouble() {
		tester.returnDouble();
	}

	@Test
	public void testShort() {
		tester.returnShort();
	}

	@Test
	public void testInt() {
		tester.returnInt();
	}

	@Test
	public void testString() {
		tester.returnString();
	}

	@Test
	public void testObject() {
		tester.returnObject();
	}

	@Test
	public void testLong() {
		tester.returnLong();
	}

	@Test
	public void testFloat() {
		tester.returnFloat();
	}

	@Test
	public void testChar() {
		tester.returnChar();
	}

}
