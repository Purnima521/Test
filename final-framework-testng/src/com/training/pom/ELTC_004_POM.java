package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_004_POM {
	private WebDriver driver; 
	
	public ELTC_004_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/main/auth/lostPassword.php']")
	private WebElement LostPswd;
	
	@FindBy(id="lost_password_user")
	private WebElement TextBox;
	
	@FindBy(id="lost_password_submit")
	private WebElement SendMsg;
	
	@FindBy(xpath="//input[@name='login' and @id='login']")
	private WebElement userName; 
	    
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	public void lostpswd()
	{
		this.LostPswd.click();
	}
	
	public void textbox(String Text)
	{
		this.TextBox.sendKeys(Text);
	}
	
	public void sendmsg()
	{
		this.SendMsg.click();
	}
	public void sendUserName(String userName) 
	{
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password)
	{
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn()
	{
		this.loginBtn.click(); 
	}
}
