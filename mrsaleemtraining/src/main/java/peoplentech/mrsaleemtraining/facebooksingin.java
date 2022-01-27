package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooksingin {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 driver.manage().window().maximize();
		Thread.sleep(5000);
	WebElement createaccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		 createaccount.click();
		 Thread.sleep(3000);
		 WebElement month0fbirth=driver.findElement(By.id("month"));
		 Select obj=new Select (month0fbirth);
	     obj.selectByValue("3");
		 WebElement birthday=driver.findElement(By.id("day"));
		 Select birth=new Select(birthday);
		 birth.selectByVisibleText("3");
		 WebElement birthyear=driver.findElement(By.name("birthday_year"));
		 Select year=new Select(birthyear);
		 year.selectByIndex(10);
		 WebElement first=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']"));
		 first.sendKeys("naim");
		 WebElement gander=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		 gander.click();
		 WebElement lastname=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='lastname']"));
		 lastname.sendKeys("chowdhury");
		 WebElement mb=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='reg_email__']"));
		 mb.sendKeys("92932866887");
		 WebElement pass=driver.findElement(By.id("password_step_input"));
		 pass.sendKeys("1234naim@@");
		 WebElement singup=driver.findElement(By.xpath("//*[text()='Sign Up'and@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		 singup.click();
		 
		 

	
	
	
	
	
	
	
	
	
	
	}

}
