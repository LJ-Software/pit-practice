package org.adrlog.practice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
	private sample tester;

	@Before
	/** Fixture */
	public void setUp() {
		tester = new sample();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}



	@Test /** Test */
	public void testSample() {
		sample.main(new String[] {"arg1", "arg2", "arg3"});
	}
}
