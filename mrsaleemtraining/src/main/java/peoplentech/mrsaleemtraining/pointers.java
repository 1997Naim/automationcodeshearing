package peoplentech.mrsaleemtraining;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointers {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.com");
		 driver.manage().window().maximize();
		 Actions obj= new Actions (driver);
		 WebElement views=driver.findElement(By.id("nav-link-accountList"));
		 obj.moveToElement(views).build().perform();
		 Thread.sleep(3000);
		 WebElement books=driver.findElement(By.linkText("Kindle Unlimited"));
		 obj.moveToElement(books).click().build().perform();
	
	
	
	
	
	
	
	
	
	
	}

}
