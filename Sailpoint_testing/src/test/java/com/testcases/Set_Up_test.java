package com.testcases;

import org.testng.annotations.Test;

import com.pageEvents.Com_set_up_task;
import com.utilities.Reusablemethods;

public class Set_Up_test extends Base_Class {
	Com_set_up_task task=new Com_set_up_task();	
	Reusablemethods reuse=new Reusablemethods();
	
	@Test
	public void set() throws Exception {
		task.new_task();
		
	
		
	}
}
