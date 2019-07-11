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
import com.training.pom.ELTC_005_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_005 {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_005_POM ELTC_005_POM;
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
		ELTC_005_POM = new ELTC_005_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest()
	{
		ELTC_005_POM.signup();
		ELTC_005_POM.frstname("Purnima");
		ELTC_005_POM.sncdname("Anand");
		ELTC_005_POM.email("abcd@gmail.com");
		ELTC_005_POM.uname("purnianand");
		ELTC_005_POM.pswd("12345");
		ELTC_005_POM.cnfrmpswd("12345");
		ELTC_005_POM.phone("12345678");
		ELTC_005_POM.teacher();
		ELTC_005_POM.register(); 
	
		
	}
}
