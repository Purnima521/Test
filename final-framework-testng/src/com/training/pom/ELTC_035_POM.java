package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_035_POM {
	private WebDriver driver; 
	
	public ELTC_035_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@href='Selenium_Training']")
	private WebElement ClickOnlink;
	
	@FindBy(id="istooldesc_1583")
	private WebElement Assignments;
	
	@FindBy(xpath="//a[@text='Purnima']")
	private WebElement AssignmentLink;
	
	@FindBy(xpath="//img[@title='Correct and rate']")
	private WebElement CorrectandRate;
	
	@FindBy(xpath="//input[@class='form-control'")
	private WebElement Score;
	
	@FindBy(id="work_comment_button")
	private WebElement SendMsg;
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void assignmentLink()
	{
		this.AssignmentLink.click();
	}
	public void assignment()
	{
		this.Assignments.click();
	}
	public void correctandRate()
	{
		this.CorrectandRate.click();
	}
	public void Score(String Score)
	{
		this.Score.sendKeys(Score);
	}
	
	public void sendmsg()
	{
		this.SendMsg.click();
	}
	public void clickOnlink()
	{
		this.ClickOnlink.click();
	}
	
}
