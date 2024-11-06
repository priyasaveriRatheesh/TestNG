package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testscript.Base;

public class Alert extends Base2 {
	@Test
	public void simplealert()
	{
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement simple=driver.findElement(By.xpath("//button[@name='alertbox']"));
		simple.click();
		String print=driver.switchTo().alert().getText();
		System.out.println(print);
		driver.switchTo().alert().accept();
		
	}
	@Test
public void confirmation()
{
	driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
	WebElement con=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
	con.click();
	String confirm=driver.switchTo().alert().getText();
	System.out.println(confirm);
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
		
}
	@Test
	public void prompt()
	{
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement prompt=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		prompt.click();
		String promtvar=driver.switchTo().alert().getText();
		System.out.println(promtvar);
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
}
