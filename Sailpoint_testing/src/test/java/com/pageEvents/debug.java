package com.pageEvents;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;

import com.pageobject.debug_mode;
import com.testcases.Base_Class;
import com.utilities.Actions_class;

public class debug extends Base_Class {
	debug_mode debug=new debug_mode();
	Actions_class action=new Actions_class();
	
	public void debug_setting(String Object, String Name) throws Exception {
		driver.findElement(debug.application_name).sendKeys(Object);
		test = extent.createTest("Shivani");
		LOG.info("Login Passed");
		TakeScreenshot("debug","application","application_name");
		TakeScreenshot("debug","application_page","Shivani");
		action.Action();
	
		driver.findElement(debug.search_name).sendKeys(Name);
		LOG.info("Search Name");
		TakeScreenshot("debug","search_name","search");
		TakeScreenshot("debug","Search_page","search_details");
		action.Action();
	  
		Thread.sleep(3000);

	   driver.findElement(debug.Check_mark).click();
	   LOG.info("click check mark ");
		TakeScreenshot("debug","check_mark","check mark");
		TakeScreenshot("debug","check_page","check");
	   driver.findElement(debug.search_action).click();
	   LOG.info("search_button");
		TakeScreenshot("debug","search_button","search_button_click");
		TakeScreenshot("debug","search_button_page","Shivani");
	   driver.findElement(debug.delete_or_new).click();
	   LOG.info("click delete ");
		TakeScreenshot("debug","delete_option","delete_option_name");
		TakeScreenshot("debug","delete_option_page","Shivani");
	   
		
	}

}
