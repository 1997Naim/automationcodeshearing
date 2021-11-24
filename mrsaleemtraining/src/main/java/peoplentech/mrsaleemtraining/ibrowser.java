package peoplentech.mrsaleemtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibrowser {
static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    //1. how to open the browser 
	// web driver is a interface
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to("https://www.amazon.com");
	 driver.manage().window().maximize();
	 driver.navigate().refresh();
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.getWindowHandle();
	 System.out.println( driver.getWindowHandle());
	 driver.getCurrentUrl();
	 System.out.println(driver.getCurrentUrl());
	 driver.close();
	
	

	}

}
