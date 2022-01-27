package myfb;

import org.testng.annotations.Test;

import myfacebook.fbhome;
import myfacebook.fbsignup;
import peoplentech.mrsaleemtraining.amazoncreateaccount;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class createaccount {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  fbhome fh=new fbhome(driver);
	  Thread.sleep(3000);
	  fh.createacclick();
	  fbsignup fs=new fbsignup(driver);
	  Thread.sleep(3000);
	  fs.firstnamesendk();
	  Thread.sleep(3000);
	  fs.lastnamesendk();
	  Thread.sleep(3000);
	  fs.emailsendk();
	  Thread.sleep(3000);
	  fs.reemail();
	  Thread.sleep(3000);
	  fs.npasswordsendk();
	  Thread.sleep(3000);
	  fs.inputmonth();
	  Thread.sleep(3000);
	  fs.inputday();
	  Thread.sleep(3000);
	  fs.inputyear();
	  Thread.sleep(3000);
	  fs.genderclick();
	  Thread.sleep(3000);
	  fs.signupclick();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 //System.setProperty("webdriver.edge.driver", "C:\\Users\\naimu\\git\\repository\\mrsaleemtraining\\src\\drivers\\msedgedriver.exe");
		 //driver=new EdgeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
