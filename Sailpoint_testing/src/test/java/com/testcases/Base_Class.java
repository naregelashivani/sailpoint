package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utilities.Reusablemethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public String  baseUrl="http://localhost:8080/identityiq";
	public String  Username="spadmin";
	public String  password="admin";
	public static WebDriver driver;

	public static ExtentReports extent;
	public static ExtentHtmlReporter html;
	public static ExtentTest test;
	static String Concatnate=".";
	protected static final Logger LOG = (Logger) LogManager.getLogger(Base_Class.class);
	
	
	@BeforeSuite
	public void generateReport()
	{
		extent = new ExtentReports();
		html = new ExtentHtmlReporter("./reports1/" + "extent.html");
		extent.attachReporter(html);
		
		html.config().setTheme(Theme.STANDARD);
		String css = ".r-img {width: 100%;}";
	    html.config().setCSS(css);
	}
	
	@BeforeMethod
	public void setup() throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Logger	log = LogManager.getLogger();
		driver.get(baseUrl);
		LOG.info("Visited Sailpoint");
		driver.findElement(By.name("loginForm:accountId")).sendKeys(Username);
		driver.findElement(By.name("loginForm:password")).sendKeys(password);
		driver.findElement(By.name("loginForm:loginButton")).click();
		LOG.info("Click on Login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		
	}
	@AfterSuite
	public void tearDown()
	{
		
		extent.flush();
	driver.close();
	}
	
    
	//Take Screen Shot
			public static void TakeScreenshot(String TestDescription,String FolderName,String ImageName) throws IOException {
				String ScreenshotName=Concatnate+Reusablemethods.CaptureScreenShot(FolderName,ImageName);
				ScreenCapture(TestDescription,ScreenshotName);
	 
			}
			public static Object ScreenCapture(String LogDetails,String ImagePath) throws IOException {
				test.log(Status.PASS,LogDetails,MediaEntityBuilder.createScreenCaptureFromPath(ImagePath).build());
				return test;
	 
			}
	
//	@AfterClass
//	public void TearDown() {
//	driver.close();
//}

}