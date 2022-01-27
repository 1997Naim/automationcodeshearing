package peoplentech.mrsaleemtraining;

import org.testng.annotations.Test;

import amazoncreateaccount.createaccount;
import amazoncreateaccount.createaccountpage;
import amazoncreateaccount.home1;
import commoncodes.utility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class amazoncreateaccount extends utility {
	//public WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  home1 hm1=new home1(driver);
	  Thread.sleep(3000);
	  hm1.singtoclick();
	  createaccount ca=new createaccount(driver);
	  Thread.sleep(3000);
	  ca.createaccountclick();
	  createaccountpage cap=new createaccountpage(driver);
	  Thread.sleep(3000);
	  cap.namesendkey();
	  Thread.sleep(3000);
	  cap.emailidsendkey();
	  Thread.sleep(3000);
	  cap.passwordsendkey();
	  Thread.sleep(3000);
	  cap.reenterpasswordkey();
	  Thread.sleep(3000);
	  cap.continuebuttonclick();
  }
  //@BeforeMethod
 /* public void beforeMethod() {
	  browsers("Edge","https://www.amazon.com");
	
}
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  public void browsers (String browser,String wbsite) {
	  String local= System.getProperty("user.dir");
	  System.out.println(local);
	  if (browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", local+"\\src\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.navigate().to(wbsite);
			 driver.manage().window().maximize();
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", local+"\\src\\drivers\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 driver.navigate().to(wbsite);
			 driver.manage().window().maximize();
	  }else {
		  System.out.println("correct browser name");
	  }
  }
  public void shots() throws IOException {
	  Date dt=new Date();
	  System.out.println(dt);
	  String dt1= dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(dt1);
	  String local= System.getProperty("user.dir");
	File store=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(store,new File(local+"\\picture\\"+dt1+"shot1.jpg"));
	
  }*/

}
