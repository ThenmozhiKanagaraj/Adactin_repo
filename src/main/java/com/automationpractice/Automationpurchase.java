package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automationpurchase {
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement signin;
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public Automationpurchase(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getBlouse() {
		return blouse;
	}
	public WebElement getQuick() {
		return quick;
	}
	public WebElement getSubt() {
		return subt;
	}
	public WebElement getChek1() {
		return chek1;
	}
	public WebElement getChek2() {
		return chek2;
	}
	public WebElement getProssadd() {
		return prossadd;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getProcesscar() {
		return processcar;
	}
	public WebElement getBank() {
		return bank;
	}
	public WebElement getSubf() {
		return subf;
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="passwd")
	private WebElement pass;
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	@FindBy(xpath="//a[text()='Blouses']")
    private WebElement blouse;
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quick;
	@FindBy(name="Submit")
	private WebElement subt;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement chek1;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	
	private WebElement chek2;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement prossadd;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath="//button[@name='processCarrier']")
	
	private WebElement processcar;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement subf;
	
	
		
	}
	


