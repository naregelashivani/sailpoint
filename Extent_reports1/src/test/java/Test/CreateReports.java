package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import Base.BaseClass;
import Utils.ReusableMethods;

public class CreateReports extends BaseClass {
	
	ReusableMethods reuse = new ReusableMethods();
	
	@Test
	public void testReports() throws Exception
	{
		test = extent.createTest("Shivani");
		test.pass("LoginPage", MediaEntityBuilder.createScreenCaptureFromPath(reuse.screenShot()).build());
	}

}
