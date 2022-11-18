package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitStrings = new jUnitFunctions();
		String result = junitStrings.addString("soft", "ware");
		assertEquals("software", result);
	}

}