package com.pageEvents;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;

import com.pageobject.Global_Setting;
import com.testcases.Base_Class;
import com.utilities.Actions_class;

public class Com_Gobal_setting extends Base_Class {
	
	Global_Setting global=new Global_Setting();
	Actions_class action=new Actions_class();

	public void global_details() throws Exception {
	driver.findElement(global.Gobal).click();
	driver.findElement(global.setting).click();
	LOG.info("CLick on Setting");
	driver.findElement(global.identity_mapping).click();
	driver.findElement(global.Email).click();
	driver.findElement(global.Add_source).click();
	LOG.info("CLick on Add Source");

	driver.findElement(global.text).sendKeys("test1");
	Thread.sleep(3000);
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
	//driver.findElement(global.select_application).click();
   Thread.sleep(3000);
	Select dropdown22 = new Select(driver.findElement(global.select_dropdown));
  dropdown22.selectByVisibleText("LastName");
	LOG.info("Selected LastName");

  driver.findElement(global.attribute).click();
  Thread.sleep(3000);
  driver.findElement(global.save).click();
	LOG.info("CLick on Save Button");

}
public void add_attribute() {
	driver.findElement(global.add_source).click();
	driver.findElement(global.attribute_name).sendKeys("username");
	LOG.info("Entered Username");

	driver.findElement(global.Save_Attribut_name).click();
	
}
}
