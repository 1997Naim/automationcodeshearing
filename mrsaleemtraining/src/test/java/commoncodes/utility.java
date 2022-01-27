package commoncodes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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

public class utility {
	public WebDriver driver;
	@Parameters({"browser","wbsite"})
 
  @BeforeMethod
  public void beforeMethod(String browser,String wbsite) {
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

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
 public void shots() throws IOException {
	  Date dt=new Date();
	  System.out.println(dt);
	  String dt1= dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(dt1);
	  String local= System.getProperty("user.dir");
	File store=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(store,new File(local+"\\picture\\"+dt1+"shot1.jpg"));
	
  }
}
