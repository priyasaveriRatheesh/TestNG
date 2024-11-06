package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testscript.Base;

public class Radiobuttons extends Base2 {
	@Test
	public void click()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		WebElement agree=driver.findElement(By.xpath("//label[@for='radio-enhanced']"));
		agree.click();
		}
	@Test
	public void isselected()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		WebElement icon2=driver.findElement(By.xpath("//label[@for='radio-choice-w-6b']"));
		//icon2.click();
		boolean two=icon2.isSelected();
		System.out.println(two);

	}
	@Test
	public void isenabled()
	{
			 
			driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
			WebElement disabledone=driver.findElement(By.xpath("//input[@id='radio-choice-7a']"));
			System.out.println(disabledone.isEnabled()); 
			WebElement iagree=driver.findElement(By.xpath("//label[text()='I agree']")); 
			System.out.println(iagree.isEnabled()); iagree.click(); 
		}
	
	@Test
	public void isdisplayed()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		WebElement two=driver.findElement(By.xpath("//label[@for='radio-choice-0b']"));
	    boolean var=two.isDisplayed();
	    System.out.println(var);
		

	}
}	



