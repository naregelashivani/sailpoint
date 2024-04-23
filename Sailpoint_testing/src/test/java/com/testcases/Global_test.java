package com.testcases;

import org.testng.annotations.Test;

import com.pageEvents.Com_Gobal_setting;
import com.utilities.Reusablemethods;

public class Global_test extends Base_Class {
	Com_Gobal_setting setting=new Com_Gobal_setting();
	Reusablemethods reuse=new Reusablemethods();

	@Test
	public void set() throws Exception  {
		setting.global_details();
		
		setting.add_attribute();
		test = extent.createTest("Shivani");
		LOG.info("Login Passed");
		TakeScreenshot("UserPassed","global","globaldetails");
		TakeScreenshot("UserSuccess","globalpage","Shivani");
	}
}
