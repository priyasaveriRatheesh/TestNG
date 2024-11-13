package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)//parametrised constructor
	{
this.driver=driver;
PageFactory.initElements(driver,this);//class pagefactory and metod initelements and parameters 
//page factory is using to inizilaze elements to driver
	}
	@FindBy(xpath="//input[@name='username']") private WebElement username;//pagefactory use cheytal findby annotaionuse aakkm
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement dashboard;
	@FindBy(css= "alert.alert-danger.alert-dismissible")private WebElement alert;


public void enterUsernameOnUserNameField(String usernamevaluepassing)
{
	// webelement name is username
	username.sendKeys(usernamevaluepassing);
}
public void enterPasswordOnpasswordField(String passwordvaluepassing)
{
	password.sendKeys(passwordvaluepassing);
}
public void clickOnLoginbutton()
{
	loginbutton.click();
}
public String alertdisplayed()
{
	return alert.getText();
}

	public boolean ishomepagedisplayed()
	{
		return dashboard.isDisplayed();
	}
	
}
