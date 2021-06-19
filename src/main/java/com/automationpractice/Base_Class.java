package com.automationpractice;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\automationpractice\\DriverM\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("web", "firefox");
			driver=new FirefoxDriver();
		}else {
			System.out.println("INVALID DRIVER");
		}
		driver.manage().window().maximize();
		
	return driver;
	}
	public static void exit() {
		driver.close();
		
	}
	public static void terminate() {
		driver.quit();
		
	}
	public static void Get(String url) {
		driver.get(url);
		
		
	} 
	public static void NavigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void Navigateback() {
		driver.navigate().back();
	}
	public static void NavigateForward() {
		driver.navigate().forward();
	}
	public static void NavigateRefresh() {
		driver.navigate().refresh();
	}
	
	
	public static void simpleAlert() {
		Alert simeAlert =driver.switchTo().alert();
		simeAlert.accept();
		 
	}
	
	public static void confirmAlertAccept() {
		Alert confAlert=driver.switchTo().alert();
		confAlert.accept();
		
	}
	public static void confirmAlertDismiss() {
		Alert Confdiss=driver.switchTo().alert();
		Confdiss.dismiss();
		
	}
	public static void promptAlertAccept() {
		Alert promacc=driver.switchTo().alert();
		promacc.accept();
	}
	public static void promptAlertDismiss() {
		Alert prodiss=driver.switchTo().alert();
		prodiss.dismiss();
	}
	public static void promptAlertSendKeys(String str) {
		Alert sendk=driver.switchTo().alert();
		sendk.sendKeys(str);
	}
	public static void ClickOnElement(WebElement element) {
		element.click();
		}
	public static void SendValues(WebElement element , String Values ) {
		element.sendKeys(Values);
		
	}

	public static void gettext(WebElement element )
	{
	String text=element.getText();
	System.out.println(text);
		
	}
	public static void SelectValues(WebElement element , String Values) {
		Select s=new Select(element);
		s.selectByValue(Values);
		
		
	}
	public static void SelectText(WebElement element, String Values) {
		Select s=new Select(element);
		s.selectByVisibleText(Values);
	}
public static void Mousehover(WebElement element )
{
	
	Actions as=new Actions(driver);
	as.moveToElement(element).build().perform();
}
public static void RightClick(WebElement element) {
	Actions ac=new Actions(driver);
	ac.contextClick(element).build().perform();
	
	
}
public static void DoubleClick(WebElement element) {
	Actions ac=new Actions(driver);
	ac.doubleClick(element).build().perform();
}
public static void DragandDrop(WebElement source, WebElement target) {
	Actions ac=new Actions(driver);
	ac.dragAndDrop(source, target).build().perform();
}
public static void FrameindexValue(int num) {
	driver.switchTo().frame(num);
}
public static void Framewebelement(WebElement element) {
	driver.switchTo().frame(element);
}
public static void FrameNameorId(String name) {
	driver.switchTo().frame(name);
}
public static void defaultcontent() {
	driver.switchTo().defaultContent();
}
public static void Robotpress( ) throws AWTException {
	Robot r=new Robot();
	r.keyPress(0);
}
	public static void Robotrelese() throws AWTException {
		Robot r=new Robot();
		r.keyRelease(0);
	
	}
	public static void windowHandling() {
	Set<String>	allid=driver.getWindowHandles();
	for (String titles : allid) {
		String title=driver.switchTo().window(titles).getTitle();
		System.out.println(title);
		}
 
		 
	}
	//DropDown-Select
	public static void dropdownvalue(WebElement element,String a) {
	Select s=new Select(element);
	s.selectByValue(a);
	}

	public static void dropdowntext(WebElement element,String a) {
	Select s=new Select(element);
	s.selectByVisibleText(a);
	}

	public static void dropdownIndex(WebElement element,int a) {
	Select s=new Select(element);
	s.selectByIndex(a);
	}
		
	
	public static void checkbox(WebElement element, String str, By arg) {
	WebElement checkbox=   driver.findElement(arg);
	checkbox.click();
	}
	public static void Isenable(WebElement  element, String str, By arg) {
		WebElement enable=driver.findElement(arg);
		if (enable.isEnabled()) {
			System.out.println("String"+enable.isEnabled());
			enable.click();
			
		}
		
			
		}
	public static void Isdisplayed(WebElement element , String str, By arg ) {
		WebElement disaple=driver.findElement(arg);
		if(disaple.isDisplayed()) {
			System.out.println("String"+disaple.isDisplayed());
			disaple.click();
		}
	}
  public static void Isselected(WebElement element , String str , By arg) {
	  WebElement select=driver.findElement(arg);
	  if(select.isSelected()) {
		  System.out.println("string"+select.isSelected());
		  select.click();
	  }
  }
 public static void GetOption(WebElement element ) {
	 Select s=new Select(element);
	List<WebElement> options=s.getOptions(); 
	for(WebElement option:options) {
		System.out.println();
	}
 }
 
 public static void GetTitle(String str) {
	 driver.get(str);
	 String title=driver.getTitle();
	 System.out.println("title is"+title);
	 
 }
 public static void GetUrl(String str) {
	 driver.get(str);
	 String Gurl=driver.getCurrentUrl();
	 System.out.println("String"+Gurl);
 }
 public static void GetText(String str,By arg) {
	 driver.get(str);
	 String Textrecived=driver.findElement(arg).getText();
	 System.out.println("string"+Textrecived);
	 
 }
 public static void GetAttribute( String src,By arg) {
	WebElement Attribute=driver.findElement(arg);
	System.out.println("get attribute"+Attribute.getAttribute(src));
	 
	 
	 
 }
 public static void implicitWait(long arg,TimeUnit unit ) {
	 driver.manage().timeouts().implicitlyWait(arg, unit);
 }
 public static void ExplictWait(By arg) {
	 WebDriverWait wait=new WebDriverWait(driver, 0);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(arg));
 }
 public static void scroll(WebElement element) {
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("argument[0].scrollIntoView();", element);
	 
 }
public static void TakeScreenshot(String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\automationpractice\\ScreenshotM\\"+name+".png");
	FileUtils.copyFile(source, dest);
}
public static void GetfirstSelectedOption(WebElement element) {
	Select s=new Select(element);
	WebElement option=s.getFirstSelectedOption();
	String printopt=option.getText();
	System.out.println(printopt);
}
public static void GetAllSelectedOption(WebElement element) {
	Select s=new Select(element);
	WebElement option=(WebElement) s.getAllSelectedOptions();
	String printallopt=option.getText();
	System.out.println(printallopt);
}
/*public static void Ismultiple(WebElement element)	{
	Select s=new Select(element);
	if(s.isMultiple())*/

	
	
	
	}




