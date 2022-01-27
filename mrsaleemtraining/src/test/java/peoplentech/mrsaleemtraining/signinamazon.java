package peoplentech.mrsaleemtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import amazonsinginautomationframework.home;
import amazonsinginautomationframework.signinc;
import commoncodes.utility;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class signinamazon{
	public static WebDriver driver;
  @Test(priority = 2,dependsOnMethods = "verificationoftext")
  public void f() throws InterruptedException {
	  home hm=new home(driver);
	  //Thread.sleep(3000);
	  hm.singtoclick();
	  Thread.sleep(3000);
	  signinc si=new signinc (driver);
	  si.Emailsendkey();
	  si.Continuebc();
  }
  @Test(priority = 1)
  public void verificationoftext() throws InterruptedException {
	  home hm=new home(driver);
	  //Thread.sleep(3000);
	  hm.singtoclick();
	  //Thread.sleep(3000);
	  signinc si=new signinc (driver);
	 si.emailsendkey1();
	  si.Continuebc();
	  String errors=si.text();
	  System.out.println(errors);
	  SoftAssert soft=new SoftAssert();//Softassert
	  soft.assertEquals(errors, "We cannot find an account with that email address");
	  String emailtp=si.emailtext();
	  System.out.println(emailtp);
	  Assert.assertEquals(emailtp, "Email or mobile phone number");
	  soft.assertAll();
  }
 @BeforeMethod
  public void beforeMethod() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.com");
		 driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
