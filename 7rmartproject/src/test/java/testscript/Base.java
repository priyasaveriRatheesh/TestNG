package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Waitutilities;

public class Base {
			public WebDriver driver;
		@BeforeMethod
		  public void initializebrowser()
		  {
		driver =new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Waitutilities.implicitwait));
		driver.manage().window().maximize();

		  }
		@AfterMethod
		  public void quitandclose()
		  {
			  //driver.close();
			//  driver.quit();

			}

		}



