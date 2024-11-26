package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtilities {

	public void fileuploadusingSenkeys(WebElement element,String path)

	{
		element.sendKeys(path);
	}
	public void fileuploadusingRobotclass(WebElement element,String path) throws AWTException//using for image upload
	{
		element.click();
		StringSelection stringselection =new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null); 
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}	

}
