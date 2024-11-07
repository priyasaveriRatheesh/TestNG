package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Robotclass extends Base {
	@Test
	public void robotclass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word ");
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles'] "));
		selectpdf.click();
		StringSelection stringobj=new StringSelection("C:\\Users\\swathish\\OneDrive\\Desktop\\java programs\\aggregation.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringobj, null);
		Robot robotobj=new Robot();
		robotobj.delay(250);
		//robotobj.keyPress(KeyEvent.VK_ENTER);
		//robotobj.keyRelease(KeyEvent.VK_ENTER);
		robotobj.keyPress(KeyEvent.VK_CONTROL);//paste
		robotobj.keyPress(KeyEvent.VK_V);//paste 
		robotobj.keyRelease(KeyEvent.VK_CONTROL);
		robotobj.keyRelease(KeyEvent.VK_V);
		robotobj.keyPress(KeyEvent.VK_ENTER);
		robotobj.keyRelease(KeyEvent.VK_ENTER);
		
			}

}
