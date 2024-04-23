package com.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.pageEvents.ApplicationTypeEvents;
import com.pageEvents.Com_set_up_task;
import com.pageobject.ADD_JDBC;
import com.pageobject.Add_new_Application;


public class Add_JDBC_test extends Base_Class {
	
	ApplicationTypeEvents application_for_Jdbc= new ApplicationTypeEvents();
	
	
	
		@Test
		public void newApp() throws Exception
		{
			
			
		Add_new_Application AP = new Add_new_Application(driver);	
		
	    AP.visitApp();
	   
	    AP.Details();
	   
		
		application_for_Jdbc.JDBCDetails();
		application_for_Jdbc.schema();
		
		}
		 
	}
	

		
		

