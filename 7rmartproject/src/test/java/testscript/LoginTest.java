package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends Base {//here claass extending to base class bcos we need to launch chromedriver
	@Test
	public void verifyTheUserisAbletologinusingvalidcredentials()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		Loginpage objofloginpage=new Loginpage(driver);//crating another class object and passing driver
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);//login page objct name.loginpage method
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean homepageloaded=objofloginpage.ishomepagedisplayed();
		Assert.assertTrue(homepageloaded,"Homepage is not loaded when the user is entering the valid credentials");
		
}@Test
	public void verifyIfTheUserIsAbleToLoginWithValidUsernameAndInvalidPassword()
	{
	String usernamevalue="admin";
	String passwordvalue="admi11";
	Loginpage objofloginpage=new Loginpage(driver);
	objofloginpage.enterUsernameOnUserNameField(usernamevalue);
	objofloginpage.enterPasswordOnpasswordField(passwordvalue);
	objofloginpage.clickOnLoginbutton();
	boolean alertvariable=objofloginpage.alertdisplayed();
	Assert.assertTrue(alertvariable,"Alert not displayed");	

			}

 @Test
	public void verifyTheUserIsAbleToLoginUsingIncorrectUsernameAndValidPassword() {
		String usernamevalue="dmin";
		String passwordvalue="admin";
		Loginpage objofloginpage=new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable=objofloginpage.alertdisplayed();
		Assert.assertTrue(alertvariable,"Alert not displayed");	
	}
@Test
	public void verifyTheUserIsAbleToLoginUsingIncorrectCredentials() {
		String usernamevalue="dmin";
		String passwordvalue="dmin";
		Loginpage objofloginpage=new Loginpage(driver);
		objofloginpage.enterUsernameOnUserNameField(usernamevalue);
		objofloginpage.enterPasswordOnpasswordField(passwordvalue);
		objofloginpage.clickOnLoginbutton();
		boolean alertvariable=objofloginpage.alertdisplayed();
		Assert.assertTrue(alertvariable,"Alert not displayed");	
	}

}
