package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightscalender {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.expedia.com");
		 driver.manage().window().maximize();
		WebElement  flight=driver.findElement(By.xpath("//*[text()='Flights']"));
		 flight.click();
		 Thread.sleep(6000);
		 WebElement depurture=driver.findElement(By.id("d1-btn"));
		 depurture.click();
		 Thread.sleep(6000);
		 WebElement selectdate=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']"));
		 selectdate.click();
		 Thread.sleep(6000);
		 WebElement done=driver.findElement(By.xpath("//button[@type='button'and@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
		 done.click();
		 WebElement returndate=driver.findElement(By.id("d2-btn"));
		 returndate.click();
		 Thread.sleep(6000);
		 WebElement selectdate2=driver.findElement(By.xpath("//*[@aria-label='Jan 26, 2022']"));
		 selectdate2.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
