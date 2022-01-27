package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilocator {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.com");
		 driver.manage().window().maximize();
	WebElement searchicon =driver.findElement(By.id("nav-search-submit-button"));//id
	
WebElement happy=driver.findElement(By.id("swm-link"));
happy.click();
WebElement bestseller=driver.findElement(By.linkText("Best Sellers"));//link text
bestseller.click();
WebElement epic=driver.findElement(By.partialLinkText("Epic Daily"));// partial link text.
epic.click();
WebElement field=driver.findElement(By.name("field-keywords"));
field.sendKeys("laptop");
WebElement searchicon1 =driver.findElement(By.id("nav-search-submit-button"));
searchicon1.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
