package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.adactinjune.runner.Test_Runner;
import com.adactinsite.helper.Page_Object_Model;
import com.automationpractice.Base_Class;
import com.automationpractice.Book_A_Hotel;
import com.automationpractice.Booked_Itinerary;
import com.automationpractice.Login_page;
import com.automationpractice.Logout_Page;
import com.automationpractice.Search_Hotel;
import com.automationpractice.Select_Hotel;
import com.configration.com.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Model pom=new Page_Object_Model(driver);
	

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url=File_Reader_Manager.getinstance().getinstace_CR().get_url();
	    Get(url);
	}
	@When("^user Enter The \"([^\"]*)\" In UserField$")
	public void user_Enter_The_In_UserField(String username) throws Throwable {
	    SendValues(pom.get_Instance_Login().getUsername(),username );
	}

	@When("^user Enter The \"([^\"]*)\" In PasswordField$")
	public void user_Enter_The_In_PasswordField(String password) throws Throwable {
	    SendValues(pom.get_Instance_Login().getPassword(), password);
	   
	}




	@Then("^user Click On The Login Button And Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Navigate_To_Search_Hotel_Page() throws Throwable {
	ClickOnElement(pom.get_Instance_Login().getLogin());
	}

	@When("^user Select The Location Of The Hotel In Loction Field$")
	public void user_Select_The_Location_Of_The_Hotel_In_Loction_Field() throws Throwable {
		
	dropdowntext(pom.get_instance_Search().getLocation(), "Brisbane");
	 
	}

	@When("^user Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
		dropdownvalue(pom.get_instance_Search().getHotels(), "Hotel Creek");
	    
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		dropdownvalue(pom.get_instance_Search().getRoom_type(), "Double");
	    
	}

	@When("^user Select The Number Of Rooms In Number Of Room Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Room_Field() throws Throwable {
	   dropdownvalue(pom.get_instance_Search().getRoom_nos(), "3"); 
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		pom.get_instance_Search().getDatepick_in().clear();
		SendValues(pom.get_instance_Search().getDatepick_in(), "12/6/2021");
	    
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		pom.get_instance_Search().getDatepick_out().clear();
		SendValues(pom.get_instance_Search().getDatepick_out(), "15/6/2021");
	    
	}

	@When("^user Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
		dropdownvalue(pom.get_instance_Search().getAdult_room(), "2");
	}

	@When("^user Select The Childern Per Room In Childern Per Room Field$")
	public void user_Select_The_Childern_Per_Room_In_Childern_Per_Room_Field() throws Throwable {
		dropdownvalue(pom.get_instance_Search().getChild_room(), "1");
	}

	@Then("^user Click On Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		ClickOnElement(pom.get_instance_Search().getSubmit());
	}

	@When("^user Select The Hotels In Select RadioButton$")
	public void user_Select_The_Hotels_In_Select_RadioButton() throws Throwable {
	ClickOnElement(pom.get_instance_select().getSelect());
	    
	    
	}

	@Then("^user Click On Continue Button And It Navigate TO Book A Hotel Page$")
	public void user_Click_On_Continue_Button_And_It_Navigate_TO_Book_A_Hotel_Page() throws Throwable {
	    ClickOnElement(pom.get_instance_select().getConbutton());
	    
	}

	@When("^user Enter The \"([^\"]*)\" In First Name Field$")
	public void user_Enter_The_In_First_Name_Field(String Firstname) throws Throwable {
		SendValues(pom.get_instance_bookhotel().getFirst_name(), Firstname);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_The_In_Last_Name_Field(String Lastname) throws Throwable {
		SendValues(pom.get_instance_bookhotel().getLast_name(), Lastname);
	    
	}


	@When("^user Enter The Billing Address In Billing Address$")
	public void user_Enter_The_Billing_Address_In_Billing_Address() throws Throwable {
	    SendValues(pom.get_instance_bookhotel().getAddress(), "mogappair 6/69");
	}

	@When("^user Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	    SendValues(pom.get_instance_bookhotel().getCardnum(), "1234567890345678");
	}

	@When("^user Enter The Credit Card Type In Credit Card Type Field$")
	public void user_Enter_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    dropdownvalue(pom.get_instance_bookhotel().getCardtype(), "VISA");
	}

	@When("^user Select Month In Expiry Date DropDown$")
	public void user_Select_Month_In_Expiry_Date_DropDown() throws Throwable {
		dropdowntext(pom.get_instance_bookhotel().getExpmonth(), "April");
	   
	}

	@When("^user Select Year In Expiry Date DropDown$")
	public void user_Select_Year_In_Expiry_Date_DropDown() throws Throwable {
	    dropdownvalue(pom.get_instance_bookhotel().getExpyear(), "2022");
	}

	@When("^user Enter The Ccv Number In Ccv Number Field$")
	public void user_Enter_The_Ccv_Number_In_Ccv_Number_Field() throws Throwable {
	    SendValues(pom.get_instance_bookhotel().getCvvnum(), "134");
	}

	@Then("^user Click On Book Now Button And Navigate To Booking Confirmation page$")
	public void user_Click_On_Book_Now_Button_And_Navigate_To_Booking_Confirmation_page() throws Throwable {
	   ClickOnElement(pom.get_instance_bookhotel().getBook_now());
	    
	}

	@Then("^user Click My Itinerary And Navigate TO Booked Itinerary page$")
	public void user_Click_My_Itinerary_And_Navigate_TO_Booked_Itinerary_page() throws Throwable {
		Thread.sleep(5000);
	    ClickOnElement(pom.get_instance_Bookit().getMy_itinerary());
	}

	@Then("^user Click Logout Button To Logout Application$")
	public void user_Click_Logout_Button_To_Logout_Application() throws Throwable {
	    ClickOnElement(pom.get_instance_Logout().getLogout());
	}


}
