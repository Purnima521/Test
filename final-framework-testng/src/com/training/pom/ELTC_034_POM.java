package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_034_POM {
	private WebDriver driver; 
	
	public ELTC_034_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='login' and @id='login']")
	private WebElement userName; 
	    
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@href='course_list.php']")
	private WebElement CourseList;
	
	@FindBy(xpath="//a[text()='Purnima_Course']")
	private WebElement PurnimaCourse;
	
	@FindBy(id="istooldesc_1559")
	private WebElement Assignments;
	
	@FindBy(xpath="//img[@title='Create assignment']")
	private WebElement CreateAssignments;
	
	@FindBy(id="form1_new_dir")
	private WebElement AssignmentName;
	
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement IFRAME;
	
	@FindBy(xpath="/html/body")
	private WebElement iframetext;
	
	@FindBy(id="advanced_params")
	private WebElement AdvancedSettings;
	
	@FindBy(id="form1_qualification")
	private WebElement MaxScore;
	
	@FindBy(id="form1_submit")
	private WebElement Validate;
	
	@FindBy(id="jqg_workList_12")
	private WebElement CheckBox;
	
		
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
	
	public void CouseList()
	{
		this.CourseList.click();
	}
	public void PurnimaCourse()
	{
		this.PurnimaCourse.click();
	}
	public void Assignments()
	{
		this.Assignments.click();
	}
	public void CreateAssignments()
	{
		this.CreateAssignments.click();
	}
	public void AssignmentName(String Name)
	{
		this.AssignmentName.clear();
		this.AssignmentName.sendKeys(Name);
	}
	
	public void IFRAME() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.switchTo().frame(this.IFRAME);
		
	}
	
	public void iframeText(String Text) 
	{
		this.iframetext.sendKeys(Text);
	}
	
	public void AdvancedSettings() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		this.AdvancedSettings.click();
	}
	public void MaxScore(String Val)
	{
		this.MaxScore.sendKeys(Val);
	}
	public void validate()
	{
		this.Validate.click();
	}
	public void checkbox()
	{
		this.CheckBox.click();
	}
}
