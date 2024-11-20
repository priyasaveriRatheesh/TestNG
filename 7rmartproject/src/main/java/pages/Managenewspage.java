package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenewspage {
	WebDriver driver;
	public Managenewspage(WebDriver driver)
	{
this.driver=driver;
PageFactory.initElements(driver,this);}
	@FindBy(xpath="//input[@name='username']") private WebElement loginusername;//pagefactory use cheytal findby annotaionuse aakkm
	@FindBy(xpath="//input[@name='password']") private WebElement loginpassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	
	
	@FindBy(css="a.small-box-footer[href='https://groceryapp.uniqassosiates.com/admin/list-news']")private WebElement moreinfobutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=2045&page_ad=1']")private WebElement deleteicon;
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
}