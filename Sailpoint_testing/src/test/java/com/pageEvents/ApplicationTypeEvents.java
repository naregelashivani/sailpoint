package com.pageEvents;

import org.openqa.selenium.support.ui.Select;

import com.pageobject.ADD_JDBC;
import com.testcases.Base_Class;

public class ApplicationTypeEvents extends Base_Class {
	
	ADD_JDBC add = new ADD_JDBC();
	
	public void JDBCDetails()
	{
		Select appType = new Select(driver.findElement(add.aaplicationType));
		appType.selectByVisibleText("JDBC");
		driver.findElement(add.configuration_2).click();
//		driver.findElement(add.connection_user).sendKeys("root");
		driver.findElement(add.connection_password).sendKeys("root");
		driver.findElement(add.database_url).clear();
		driver.findElement(add.database_url).sendKeys("jdbc:mysql://localhost/shivani");
//		driver.findElement(add.jdbc_driver).sendKeys("com.mysql.cj.jdbc.Driver");
		//driver.findElement(add.Test_Connection_SQL).sendKeys("");
		driver.findElement(add.SQL_Statement).sendKeys(" select * from shivani.office;");
		//driver.findElement(add.getObjectSQL).sendKeys("");
		driver.findElement(add.test).click();
		
	}
	public void schema()
	{
		driver.findElement(add.schemaType).click();
		driver.findElement(add.Identity_Attribute).sendKeys("EmpId");
		driver.findElement(add.Display_Attribute).sendKeys("FirstName");
		driver.findElement(add.Discover_Schema_Attributes).click();
		driver.findElement(add.Preview).click();
		driver.findElement(add.cancle).click();
		driver.findElement(add.save).click();
	}

}