package com.training.pom;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_005_POM {
	private WebDriver driver; 
	
	public ELTC_005_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")
	private WebElement SignUp;
	
	@FindBy(id="registration_firstname")
	private WebElement FrstName;
	
	@FindBy(id="registration_lastname")
	private WebElement ScndName;
	
	@FindBy(id="registration_email")
	private WebElement Email;
	
	@FindBy(id="username")
	private WebElement UName;
	
	@FindBy(id="pass1")
	private WebElement pass;
	
	@FindBy(id="pass2")
	private WebElement CnfrmPswd;
	
	@FindBy(id="registration_phone")
	private WebElement Phone;
	
	//@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	//private WebElement ListVal;
	
	//@FindBy(xpath="//input[@role='textbox']")
	//private WebElement English;
	
	@FindBy(xpath="//input[@name='status' and @value='1']")
	private WebElement Teacher;
	
	@FindBy(xpath="//button[@id='registration_submit']")
	private WebElement Register;
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void signup()
	{
		this.SignUp.click();
	}
	public void frstname(String name)
	{
		this.FrstName.sendKeys(name);
	}
	public void sncdname(String sndname)
	{
		this.ScndName.sendKeys(sndname);
	}
	public void email(String mail)
	{
		this.Email.sendKeys(mail);
	}
	public void uname(String uname)
	{
		this.UName.sendKeys(uname);
	}
	public void pswd(String pswd)
	{
		this.pass.sendKeys(pswd);
	}
	public void cnfrmpswd(String cnfrmpswd)
	{
		this.CnfrmPswd.sendKeys(cnfrmpswd);
	}
	public void phone(String num)
	{
		this.Phone.sendKeys(num);
	}
		public void teacher()
	{
		this.Teacher.click();
	}
	public void register()
	{
		this.Register.click();
	}
	
	}
