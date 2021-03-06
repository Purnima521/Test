package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_035_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_035 {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_035_POM ELTC_035_POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		ELTC_035_POM = new ELTC_035_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		ELTC_035_POM.sendUserName("manipal");
		ELTC_035_POM.sendPassword("manipal");
		ELTC_035_POM.clickLoginBtn();
		ELTC_035_POM.assignmentLink();
		ELTC_035_POM.assignment();
		ELTC_035_POM.correctandRate();
		ELTC_035_POM.Score("40");
		ELTC_035_POM.sendmsg();
		ELTC_035_POM.clickOnlink();
		
		//screenShot.captureScreenShot("First");
	}
}
