package com.pageEvents;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;

import com.pageobject.Add_New_Set_Up;
import com.testcases.Base_Class;

public class Com_set_up_task extends Base_Class {
	Add_New_Set_Up Add_set=new Add_New_Set_Up();
	
	public void new_task() throws Exception {
	
		
		driver.findElement(Add_set.setup).click();
		Thread.sleep(3000);
		
		driver.findElement(Add_set.Task).click();
		driver.findElement(Add_set.New_task).click();
		driver.findElement(Add_set.Account_details).click();
		driver.findElement(Add_set.Name_details).sendKeys("test150123");
		driver.findElement(Add_set.Scan).sendKeys("shivani");
		
		driver.findElement(Add_set.drop_down).click();
		driver.findElement(Add_set.select_drop_down).sendKeys("test1");
		Thread.sleep(3000);
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(Add_set.Save_execute).click();
        driver.findElement(Add_set.click_ok).click();

}}
