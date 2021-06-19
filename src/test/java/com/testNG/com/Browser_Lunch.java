package com.testNG.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser_Lunch {
	@BeforeSuite
	private void browserSetup() {
		System.out.println("SET UP");
		

	}
	@BeforeTest
	private void browser() {
		System.out.println("Chrome");

	}
	@BeforeClass
   private void Url() {
	System.out.println("Amazon");

}
	@BeforeMethod
	private void login() {
		System.out.println("login");
		

	}
	@Test
	private void iphonesearch() {
		System.out.println("iphone search");
	

	}
	@Test
	private void addcart() {
		System.out.println("add to cart");

	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");

	}
	@AfterClass
	private void close() {
		System.out.println("browser close");

	}
	@AfterTest
	private void verification() {
		System.out.println("verification done");

	}
	@AfterSuite
	private void cookies() {
		System.out.println("cokies deleted");

	}
	
}
