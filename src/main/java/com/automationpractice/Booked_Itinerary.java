package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public WebDriver driver;


	public Booked_Itinerary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
				
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	@FindBy(name="my_itinerary")
	private WebElement my_itinerary  ;
	

	

	




}
