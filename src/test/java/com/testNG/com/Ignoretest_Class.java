package com.testNG.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoretest_Class {
	@Ignore//using this annotation we can ignore
	@Test
	private void red() {
		System.out.println("red");
	}
	@Test (enabled = false )//or using this we can ignore
	private void green() {
		System.out.println("green");

	}
	@Test
	private void yellow() {
		System.out.println("yellow");

	}



}
