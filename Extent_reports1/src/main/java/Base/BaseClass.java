package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter html;
	public static ExtentTest test;
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void generateReport()
	{
		extent = new ExtentReports();
		html = new ExtentHtmlReporter("./reports/" + "extent.html");
		extent.attachReporter(html);
		
		html.config().setTheme(Theme.STANDARD);
		String css = ".r-img {width: 100%;}";
	    html.config().setCSS(css);
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
