package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualsTest()
	{
		driver.navigate().to(" https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);//not necessary
		String expected="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expected," notmatching");//not matching is for printing error message
	}
	@Test
	public void assertnotequals()
	
	{
		driver.navigate().to(" https://www.browserstack.com/");//match aayal false
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expected="most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expected," notmatching");
	
	}
	@Test
	public void asserttrue()
	{
		driver.navigate().to(" https://www.browserstack.com/");
          boolean title=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
          Assert.assertTrue(title,"both are equal");
	}
	@Test
	public void assertfalse()
	{
		driver.navigate().to(" https://www.browserstack.com/");
        boolean title=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        Assert.assertFalse(title,"Not equal");
	
	}
	
	

}
