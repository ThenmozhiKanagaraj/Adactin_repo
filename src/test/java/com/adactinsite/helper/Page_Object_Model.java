package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.Book_A_Hotel;
import com.automationpractice.Booked_Itinerary;
import com.automationpractice.Login_page;
import com.automationpractice.Logout_Page;
import com.automationpractice.Search_Hotel;
import com.automationpractice.Select_Hotel;

public class Page_Object_Model {
	public WebDriver driver;
	private Login_page Login;
	private Search_Hotel Search;
	private Select_Hotel Select;
	private Book_A_Hotel Boohh;
	private Booked_Itinerary Book;
	private Logout_Page Logout;
	public Page_Object_Model(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
public Login_page get_Instance_Login() {
Login =new Login_page(driver);
return Login;
	}
public Search_Hotel get_instance_Search() {
	Search =new Search_Hotel(driver);
	return Search;
}
public Select_Hotel get_instance_select() {
	Select=new Select_Hotel(driver);
	return Select;

}
public Book_A_Hotel get_instance_bookhotel() {
Boohh=new Book_A_Hotel(driver);
return Boohh;
}
public Booked_Itinerary get_instance_Bookit() {
Book=new Booked_Itinerary(driver);
return Book;
}
public Logout_Page get_instance_Logout() {
Logout=new Logout_Page(driver);
return Logout;
}



}
