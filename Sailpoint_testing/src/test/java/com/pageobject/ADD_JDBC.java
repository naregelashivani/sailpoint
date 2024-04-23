package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testcases.Base_Class;

public class ADD_JDBC  {
	
	public By aaplicationType = By.xpath("//select[@name='editForm:connector']");
	public By configuration_2=By.xpath("//span[contains(text(),'Configuration')]");
	public By connection_user=By.xpath("//input[contains(@id,'editForm:j_idt1106:r_id_account:user_')]");
	public By connection_password=By.xpath("//input[contains(@id,'editForm:j_idt1106:r_id_account:password_')]");
	public By database_url=By.xpath("//input[contains(@id,'editForm:j_idt1106:r_id_account:url_')]");
	public By jdbc_driver=By.xpath("//input[contains(@id,'editForm:j_idt1106:r_id_account:driverClass_')]");
	public By Test_Connection_SQL=By.xpath("//textarea[contains(@name,'editForm:j_idt1106:r_id_account:j_idt1135')]");
	public By SQL_Statement =By.xpath("//textarea[contains(@name,'editForm:j_idt1106:r_id_account:SQL_')]");
	public By getObjectSQL=By.xpath("//textarea[contains(@name,'editForm:j_idt1106:r_id_account:j_idt1150')]");
	public By test=By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[10]")	;
	
	
	
	
	
	public By schemaType=By.xpath("//span[contains(@id,'tab-1083-btnInnerEl')]");
	public By Identity_Attribute=By.xpath("//input[contains(@name,'editForm:j_idt469:0:j_idt487')]");
	public By Display_Attribute=By.xpath("//input[contains(@id,'ext-gen1180')]");
	public By Discover_Schema_Attributes=By.xpath("//span[contains(text(),'Discover Schema Attributes')]");
	public By Preview=By.xpath("//input[contains(@class,'primaryBtn')]");
	public By cancle=By.xpath("//img[@id='tool-1192-toolEl']");
	public By save=By.xpath("//input[contains(@id,'editForm:saveAppBtn')]");

	}

