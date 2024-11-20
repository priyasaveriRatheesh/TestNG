package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import utilities.ExelUtilities;

public class AdminUserTest extends Base{
	
@Test
public void UpdateTheFields()throws IOException
{
		String loginusername="admin";
		String loginpassword="admin";
		//String loginusername=ExelUtilities.getStringData(1, 0, "AdminUserPage");
		//String loginpassword=ExelUtilities.getStringData(1, 1, "AdminUserPage");
				
		AdminUserPage objAdminUserPage=new AdminUserPage(driver);
		objAdminUserPage.enterUsernameOnUserNameField(loginusername);
		objAdminUserPage.enterPasswordOnpasswordField(loginpassword);
		objAdminUserPage.clickOnLoginbutton();
		
		String usernameupdate="user123";
		String passwordupdate="admin12345";
		//String usernameupdate=ExelUtilities.getStringData(2, 0, "AdminUserPage");
		//String passwordupdate=ExelUtilities.getStringData(2, 1, "AdminUserPage");
		
		int usertypeupdate=1;
		objAdminUserPage.clickonmoreinfo();
		objAdminUserPage.clickonupdateicon();
		objAdminUserPage.enterupdatedusername(usernameupdate);
		objAdminUserPage.updatepassword(passwordupdate);
		objAdminUserPage.selectvalueofusertype(usertypeupdate);
		objAdminUserPage.clickonupdatedetailsbutton();
	    boolean alertvariable=objAdminUserPage.isalertdisplayed();
	    Assert.assertTrue(alertvariable, "Alert not displayednewUsertpe");
}
	
}