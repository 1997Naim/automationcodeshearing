package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
	WebElement simplealert=driver.findElement(By.id("alertButton"));
	simplealert.click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	WebElement sa1=driver.findElement(By.id("timerAlertButton"));
	sa1.click();
	Thread.sleep(6000);
	driver.switchTo().alert().accept();
	WebElement sa2=driver.findElement(By.id("confirmButton"));
	sa2.click();
	driver.switchTo().alert().dismiss();
	
	
	
	
	}

}
