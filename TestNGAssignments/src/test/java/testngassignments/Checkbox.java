package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testscript.Base;

public class Checkbox  extends Base2{
	@Test
	public void click()
	{
		driver.navigate().to("https://formstone.it/components/checkbox/");
		WebElement two=driver.findElement(By.xpath("//label[@for='checkbox-2']"));
		two.click();
		}
	@Test
	public void isselected()//always false aano?
	{
		 driver.navigate().to("https://formstone.it/components/checkbox/");
		  WebElement one=driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		   System.out.println(one.isSelected());

	}
	@Test
	public void isenabled()
	{
		driver.navigate().to("https://formstone.it/components/checkbox/");
	    WebElement disabledone=driver.findElement(By.xpath(""));
	   
	}
	@Test
	public void isdisplayed()
	{
		driver.navigate().to("https://formstone.it/components/checkbox/");
		WebElement theam=driver.findElement(By.xpath("//label[@for='checkbox-t-2a']"));
		theam.click();
	    boolean var=theam.isDisplayed();
	    System.out.println(var);
		}

}
