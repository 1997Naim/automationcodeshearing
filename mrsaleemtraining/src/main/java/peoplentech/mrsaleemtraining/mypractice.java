package peoplentech.mrsaleemtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mypractice {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	for(int a=0;a<=4;a++){
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

}
