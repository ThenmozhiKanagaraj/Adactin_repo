package com.automationpractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.automationpractice.Automationpurchase;
import com.automationpractice.Base_Class;



public class Project2_Class extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		driver=browserLaunch("chrome");
		Get("http://automationpractice.com/index.php");
		Automationpurchase ap=new Automationpurchase(driver);
		ClickOnElement(ap.getSignin());
		SendValues(ap.getEmail(), "dhikshan04@gmail.com");
		SendValues(ap.getPass(), "dhikshan@04");
		ClickOnElement(ap.getSubmit());
		Mousehover(ap.getWomen());
		ClickOnElement(ap.getBlouse());
		ClickOnElement(ap.getQuick());
		FrameindexValue(0);
		ClickOnElement(ap.getSubt());
		Thread.sleep(2000);
		ClickOnElement(ap.getChek1());
		ClickOnElement(ap.getChek2());
		ClickOnElement(ap.getProssadd());
		ClickOnElement(ap.getCheckbox());
		ClickOnElement(ap.getProcesscar());
		ClickOnElement(ap.getBank());
		ClickOnElement(ap.getSubf());
		TakeScreenshot("project2");
		
		
/*	WebElement signin= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	ClickOnElement(signin);
		WebElement email= driver.findElement(By.id("email"));
		SendValues(email, "dhikshan04@gmail.com");
		WebElement pass= driver.findElement(By.id("passwd"));
	    SendValues(pass, "dhikshan@04");
		 WebElement submit= driver.findElement(By.id("SubmitLogin"));
		 ClickOnElement(submit);
		WebElement women=driver.findElement(By.xpath("//a[text()='Women']"));
		Mousehover(women);
		 
	    WebElement blouse= driver.findElement(By.xpath("//a[text()='Blouses']"));
	    ClickOnElement(blouse);
	    Thread.sleep(2000);
	    WebElement quick= driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	    ClickOnElement(quick);
	    driver.switchTo().frame(0);
		 
		WebElement subt= driver.findElement(By.name("Submit"));
		ClickOnElement(subt);
		
		  Thread.sleep(5000);
		WebElement chek1=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ClickOnElement(chek1);
		 WebElement chek2= driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		  ClickOnElement(chek2);
		 WebElement prossadd= driver.findElement(By.xpath("//button[@name='processAddress']"));
		 ClickOnElement(prossadd);
		  WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']") );
		  ClickOnElement(checkbox);
		  WebElement processcar=driver.findElement(By.xpath("//button[@name='processCarrier']"));
		  ClickOnElement(processcar);
		 WebElement bank= driver.findElement(By.xpath("//a[@class='bankwire']"));
		 ClickOnElement(bank);
		WebElement subf= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ClickOnElement(subf);
		  TakeScreenshot("project2");*/
		  
		  
		  
	
		
		
		
		
	}

}
