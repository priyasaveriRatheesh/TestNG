package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testscript.Base;

public class Checkbox  extends Base2{
	@Test
	public void click()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
		WebElement agree=driver.findElement(By.xpath("//label[@for='checkbox-mini-0']"));
		agree.click();
		}
	@Test
	public void isselected()//always false
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
		WebElement vertical=driver.findElement(By.xpath("//label[@for='checkbox-v-2a']"));
		//vertical.click();
		boolean var=vertical.isSelected();
		System.out.println(var);

	}
	@Test
	public void isenabled()//doubt
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
		WebElement disabledone=driver.findElement(By.xpath(""));
		System.out.println(disabledone.isEnabled()); 
		WebElement iagree=driver.findElement(By.xpath("//label[text()='I agree']")); 
		System.out.println(iagree.isEnabled()); iagree.click();

	}
	@Test
	public void isdisplayed()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
		WebElement theam=driver.findElement(By.xpath("//label[@for='checkbox-t-2a']"));
	    boolean var=theam.isDisplayed();
	    System.out.println(var);
		}

}
