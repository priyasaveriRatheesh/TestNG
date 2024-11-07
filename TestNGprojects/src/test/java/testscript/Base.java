package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver driver;
@BeforeMethod
  public void initializebrowser()
  {
driver =new ChromeDriver();
driver.get("https://selenium.qabible.in/select-input.php ");
driver.manage().window().maximize();
  }
@AfterMethod
  public void quitandclose()
  {
	  //driver.close();
	//  driver.quit();

	}

}
