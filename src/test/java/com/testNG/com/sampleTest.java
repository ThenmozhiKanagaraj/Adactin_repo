package com.testNG.com;

import org.testng.annotations.Test;

public class sampleTest {
	@Test
	private void demo() {
System.out.println(10/10);
	}
	@Test(retryAnalyzer = MyreTry.class)
	private void divide() {
		System.out.println(10/0);

	}

}
