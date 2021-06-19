package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	public Book_A_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	@FindBy(name="first_name")
	private WebElement first_name ;
	@FindBy(name="last_name")
	private WebElement last_name ;
	@FindBy(name="address")
	private WebElement address  ;
	@FindBy(name="cc_num")
	private WebElement  cardnum  ;
	@FindBy(name="cc_type")
	private WebElement cardtype ;
	@FindBy(name="cc_exp_month")
	private WebElement expmonth ;
	@FindBy(name="cc_exp_year")
	private WebElement expyear  ;
	@FindBy(name="cc_cvv")
	private WebElement cvvnum  ;
	@FindBy(name="book_now")
	private WebElement book_now  ;
	
	
	
	
	
	
	
	
	
	



}
