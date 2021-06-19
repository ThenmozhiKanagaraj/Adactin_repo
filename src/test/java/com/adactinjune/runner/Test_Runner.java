package com.adactinjune.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automationpractice.Base_Class;
import com.configration.com.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactinjune//feature",glue="com.adactin.stepdefination",
monochrome =true,
dryRun=false,
strict=false,
tags=("@smoketest,@sanitytest"),plugin= {"html:Report/HTML_Report", "pretty","json:Report/CucumberJSON_report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
		
		})



public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() throws Throwable {
		String browser=File_Reader_Manager.getinstance().getinstace_CR().get_browser();
		driver = Base_Class.browserLaunch(browser);
		}
	@AfterClass
public static void tear_down() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}

