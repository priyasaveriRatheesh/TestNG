package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
		WebDriver driver;
		public  AdminUserPage(WebDriver driver)
		{
	   this.driver=driver;
	    PageFactory.initElements(driver,this);
	
		}
		@FindBy(xpath="//input[@name='username']") private WebElement loginusername;
		@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
		@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
		
		@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement moreinfobutton;
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=10756&page_ad=1']")private WebElement updateicon;
		@FindBy(xpath="//input[@id='username']")private WebElement usernameupdate;
		@FindBy(xpath="//input[@id='password']")private WebElement passwordupdate;
		@FindBy(xpath="//select[@id='user_type']")private WebElement usertypeupdate;
		@FindBy(xpath="//button[@name='Update']")private WebElement updatebutton;
		@FindBy(xpath="//h5[text()=' Alert!']")private WebElement alert;

				 		 	 
		public void enterUsernameOnUserNameField(String usernamevaluepassing)//avdunn pass cheyunnat store akunnat usernamevaluepassing
		{
			loginusername.sendKeys(usernamevaluepassing);
		}
		public void enterPasswordOnpasswordField(String passwordvaluepassing)
		{
			loginpassword.sendKeys(passwordvaluepassing);
		}
		public void clickOnLoginbutton()
		{
			loginbutton.click();
		}

		
		
		public void clickonmoreinfo()
         {
        	 moreinfobutton.click();
         }
         
        public void clickonupdateicon()
        {
	    updateicon.click();
        }
	   public void enterupdatedusername(String updatedusernamepassing)
	   {
		   usernameupdate.clear();
		   usernameupdate.sendKeys(updatedusernamepassing);
	    }
	   public void updatepassword( String updatedpasswordpassing)
	   {
		   passwordupdate.clear();
		   passwordupdate.sendKeys(updatedpasswordpassing);
     	}
	  public void selectvalueofusertype(int udatedUsertypepassing)
	   {
		  
		  Select selectobj=new Select(usertypeupdate);
		  selectobj.selectByIndex(udatedUsertypepassing);
		
	    }
	  
	public void clickonupdatedetailsbutton()
	   {
		updatebutton.click();
	    }
	   public boolean isalertdisplayed() {
	   
		return alert.isDisplayed();
	   }
}