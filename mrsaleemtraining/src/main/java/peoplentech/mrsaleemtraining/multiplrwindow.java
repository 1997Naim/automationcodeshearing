package peoplentech.mrsaleemtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiplrwindow {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://amazon.com");
		 driver.manage().window().maximize();
		 WebElement books=driver.findElement(By.linkText("Kindle Books"));
		 Actions ob=new Actions (driver);
	ob.keyDown(Keys.SHIFT).build().perform();
	books.click();
	ob.keyUp(Keys.SHIFT).build().perform();
	String currentwindow=driver.getWindowHandle();
	System.out.println(currentwindow);
Set<String> windowh=driver.getWindowHandles();
Iterator<String>iterators=windowh.iterator();
String pwh=iterators.next();
String cwh=iterators.next();
System.out.println("this is parent window"+pwh);
System.out.println("this is child window "+cwh);
driver.switchTo().window(cwh);
Thread.sleep(3000);
	WebElement exclusive=driver.findElement(By.linkText("Kindle Exclusives"));
	exclusive.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
