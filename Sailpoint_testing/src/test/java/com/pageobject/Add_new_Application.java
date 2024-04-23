package com.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;
import com.testcases.Base_Class;

public class Add_new_Application {
	WebDriver ldriver;
	WebDriver driver;
	 public WebDriverWait wait;
	public Add_new_Application(WebDriver rdriver){
		
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		
			
		}
		
		@FindBy(xpath ="(//span[@role='presentation'])[3]")
		public WebElement adduserDropdown;
		@FindBy(xpath="(//a[@role=\"menuitem\"])[12]")
		WebElement application_def;
		@FindBy(xpath="(//span[@class=\"x-btn-inner\"])[1]")
		WebElement Add_application;	
		@FindBy(xpath="(//input[@type=\"text\"])[2]")
		WebElement Add_Name;	
		@FindBy(xpath="(//input[@type=\"text\"])[4]")
		WebElement Add_owner;
		@FindBy(xpath="(//div[@class=\"sectionHeader iconComboItem\"])[3]")
		WebElement Add_administors;	
		@FindBy(xpath="//select[@name=\"editForm:connector\"]")
		WebElement Application_dropdown;
		@FindBy(xpath="(//input[@type=\"checkbox\"])[1]")
		WebElement Authoritative_check;
		@FindBy(xpath="//div[@id=\"tab-1091\"]")
		WebElement configuration;
		@FindBy(xpath="//input[contains(@id,\"editForm:j_idt1298:r_id_account:filename_\")]")
		WebElement File_Path ;
		@FindBy(xpath="//input[contains(@id,'editForm:j_idt1298:r_id_account:delimiter_')]")
		WebElement Delimiter ;
		@FindBy(xpath="//input[contains(@name,\"editForm:j_idt1298:r_id_account:j_idt1378\")]")
		WebElement delimeter_file;
		@FindBy(xpath="(//span[@class=\"ui-button-text ui-c\"])[10]")
		WebElement Test_Connection;
		
		 public void visitApp() throws Exception {
			 Thread.sleep(2000);
			 adduserDropdown.click();
			 application_def.click();
			 Add_application.click();
			 

	
	}
		public void Details() {
			
			Add_Name.sendKeys("shivani");	
			Add_owner.click();
			Add_administors.click();
			//Application_dropdown.click();
//			Select dropdown = new Select(Application_dropdown);
//		       dropdown.selectByVisibleText("JDBC");
//		       Authoritative_check.click();
//		       
//			
		} 
//		 public void configuration_detail() throws InterruptedException
//		 {
//			 configuration.click(); 
			 
//			 File_Path.sendKeys("‪D:\\CSV_AUTH_EMPLOYEES\\filepath.txt");
//			 Thread.sleep(3000);
//
//			 Delimiter.sendKeys(",");
//			 delimeter_file.click();
//			 Test_Connection.click();
			 
		 }
		 
		 
		 
		 
		 
		 
		 


