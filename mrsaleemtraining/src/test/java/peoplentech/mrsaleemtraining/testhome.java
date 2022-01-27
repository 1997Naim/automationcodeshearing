package peoplentech.mrsaleemtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazoncreateaccount.homepage;

public class testhome {
	public static WebDriver driver;
	  @Test
	  public void f() {
		homepage hp=new homepage(driver);
		hp.myaclick();

		
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  String local=System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", local+"\\src\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.navigate().to("https://www.homedepot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(6000);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		 
	  }
}
