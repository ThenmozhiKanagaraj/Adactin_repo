package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getConbutton() {
		return conbutton;
	}
	@FindBy(name="radiobutton_0")
	private WebElement select;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement conbutton;
	
	

	

	

}
