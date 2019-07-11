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
import com.training.pom.ELTC_034_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_034 {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_034_POM ELTC_034_POM;
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
		ELTC_034_POM = new ELTC_034_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	

	 @AfterMethod public void tearDown() throws Exception { Thread.sleep(1000);
	 driver.quit(); }
	 	@Test
	public void validLoginTest() throws InterruptedException {
		ELTC_034_POM.sendUserName("admin");
		ELTC_034_POM.sendPassword("admin@123");
		ELTC_034_POM.clickLoginBtn(); 
		ELTC_034_POM.CouseList();
		ELTC_034_POM.PurnimaCourse();
		ELTC_034_POM.Assignments();
		ELTC_034_POM.CreateAssignments();
		ELTC_034_POM.AssignmentName("Purnima");
		ELTC_034_POM.IFRAME();
		ELTC_034_POM.iframeText("Description");
		ELTC_034_POM.AdvancedSettings();
		ELTC_034_POM.MaxScore("50");
		ELTC_034_POM.validate();
		ELTC_034_POM.checkbox();
		//screenShot.captureScreenShot("First");
	}
}
