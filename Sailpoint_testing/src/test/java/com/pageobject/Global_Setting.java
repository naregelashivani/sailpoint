package com.pageobject;

import org.openqa.selenium.By;

public class Global_Setting {
	public By Gobal  = By.xpath("(//a[contains(@class,'dropdown-toggle')])[6]");
	public By setting=By.xpath("(//a[contains(@class,'menuitem')])[24]");
	public By identity_mapping=By.xpath("(//a[contains(@class,'list-group-item')])[3]");
	public By Email=By.xpath("(//div[contains(@class,'x-grid-cell-inner ')])[11]");
	public By Add_source=By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[6]");
	public By text=By.xpath("//input[contains(@id,'appSuggest-inputEl')]");
	//public By select_application=By.xpath("//div[contains(@id,'ext-gen1074')]");
	public By select_dropdown=By.xpath("//select[contains(@name,'configForm:sourceAttributes')]");
	public By attribute=By.xpath("//div[contains(@id,'button-1029')]");
	public By save=By.xpath("(//input[contains(@type,'submit')])[5]");
	
	
	
	
	public By add_source=By.xpath("//input[contains(@value,'Add New Attribute')]");
	public By attribute_name=By.xpath("//input[contains(@id,'configForm:attribute')]");
	public By Save_Attribut_name=By.xpath("//input[contains(@name,'configForm:saveButton')]");
	
	

}

