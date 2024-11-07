package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base {
	@Test
	public void javascriptexecutor()
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)" , "");//scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");//automaticall calculate the end of the page

	}
	@Test
	public void message()//normal method to inspect a button in practise site
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messge=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messge.sendKeys("priya");
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();

	}
	@Test
public void javasciptmethd()//using javascript to click
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement msg=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='priya';",msg);//enter value
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
	js.executeScript("arguments[0].click();",button);//click
}
	
}
