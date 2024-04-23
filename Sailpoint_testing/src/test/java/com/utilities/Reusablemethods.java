package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import com.google.common.io.Files;
import com.testcases.Base_Class;



public class Reusablemethods extends Base_Class {
	
	public static String CaptureScreenShot(String Folder,String ImageName) throws IOException {
		File ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File srcFile=ts.getScreenshotAs(OutputType.FILE);
		String destFile="./reports1/screenshots/"+Folder+"/"+ImageName+".png";
		File Path=new File(destFile);
		FileUtils.copyFile(ts,Path);
		return destFile;
 
 
	}
	

}
