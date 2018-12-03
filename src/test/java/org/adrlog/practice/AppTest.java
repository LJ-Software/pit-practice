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
	public byte testByte() {
		return tester.returnByte();
	}

	@Test
	public double testDouble() {
		return tester.returnDouble();
	}

	@Test
	public short testShort() {
		return tester.returnShort();
	}

	@Test
	public int testInt() {
		return tester.returnInt();
	}

	@Test
	public String testString() {
		return tester.returnString();
	}

	@Test
	public Object testObject() {
		return tester.returnObject();
	}

	@Test
	public long testLong() {
		return tester.returnLong();
	}

	@Test
	public float testFloat() {
		return tester.returnFloat();
	}

	@Test
	public char testChar() {
		return tester.returnChar();
	}

}
