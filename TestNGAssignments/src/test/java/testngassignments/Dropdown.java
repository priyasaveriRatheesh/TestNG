package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testscript.Base;

public class Dropdown extends Base2{
@Test
	public void index()
	{
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement cntry=driver.findElement(By.xpath("//body[@style='background-image: none']"));
		Select obj=new Select(cntry);
	  obj.selectByIndex(8);
		
	}
@Test
	public void text()
	{
	driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement cntry=driver.findElement(By.xpath("//body[@style='background-image: none']"));
	Select obj=new Select(cntry);
  obj.selectByVisibleText("Antarctica");
	}
@Test
public void value()
{
driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
WebElement cntry=driver.findElement(By.xpath("//body[@style='background-image: none']"));
Select obj=new Select(cntry);
obj.selectByValue("ATA");
}

}

