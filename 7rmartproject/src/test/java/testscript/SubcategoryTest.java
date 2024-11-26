package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Subcategorypage;
import utilities.ExelUtilities;

public class SubcategoryTest {
	@Test
	public void createSubcategory() throws IOException, AWTException {
		String loginusernamevalue=ExelUtilities.getStringData(1, 0,"LoginPage"); 
		String loginpasswordvalue=ExelUtilities.getStringData(1, 1,"LoginPage");
		Subcategorypage subcategorypage=new Subcategorypage(null);
		subcategorypage.enterUsernameOnUsernameField(loginusernamevalue);
		subcategorypage.enterPasswordOnPasswordField(loginpasswordvalue);
		subcategorypage.clickOnSigninButton();
		
		String categoryvalue=ExelUtilities.getStringData(1, 0,"SubcategoryPage");
		String subcategoryvalue=ExelUtilities.getStringData(1, 1,"SubcategoryPage");
		subcategorypage.selectValueOnCateforyFieldDropdown(categoryvalue);
		subcategorypage.selectValueOnSubcateforyFieldDropdown(subcategoryvalue);
		subcategorypage.fileUpload();
		subcategorypage.clickOnSavebutton();
		boolean alertdisplayed=subcategorypage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed,"Green success Alert not displayed");
	}
	@Test
	public void createExistingSubcategory() throws IOException, AWTException {
		String loginusernamevalue=ExelUtilities.getStringData(1, 0,"LoginPage"); 
		String loginpasswordvalue=ExelUtilities.getStringData(1, 1,"LoginPage");
		Subcategorypage subcategorypage=new Subcategorypage(null);
		subcategorypage.enterUsernameOnUsernameField(loginusernamevalue);
		subcategorypage.enterPasswordOnPasswordField(loginpasswordvalue);
		subcategorypage.clickOnSigninButton();
		
		String categoryvalue=ExelUtilities.getStringData(2, 0,"SubcategoryPage");
		String subcategoryvalue=ExelUtilities.getStringData(2, 1,"SubcategoryPage");
		subcategorypage.selectValueOnCateforyFieldDropdown(categoryvalue);
		subcategorypage.selectValueOnSubcateforyFieldDropdown(subcategoryvalue);
		subcategorypage.clickOnSavebutton();
		boolean alertdisplayed=subcategorypage.isAlertMessageDisplayed();
		Assert.assertTrue(alertdisplayed,"Red error Alert not displayed");
	}
}

