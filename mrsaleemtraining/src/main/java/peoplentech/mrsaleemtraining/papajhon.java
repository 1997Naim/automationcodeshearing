package peoplentech.mrsaleemtraining;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class papajhon {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.papajohns.com");
		 driver.manage().window().maximize();
		 WebElement startyourorder=driver.findElement(By.xpath("//*[@data-track-click='top-nav|Start Your Order']"));
		 startyourorder.click();
		 Thread.sleep(6000);
		 WebElement country=driver.findElement(By.id("locations-country"));
		 country.click();
		 Select c=new Select(country);
		 c.selectByValue("usa");
		 Thread.sleep(6000);
		 WebElement addresstype=driver.findElement(By.id("locations-addresstype"));
		 addresstype.click();
		 Select add=new Select(addresstype);
		 add.selectByValue("HOME");
		 Thread.sleep(6000);
		 WebElement streetadd=driver.findElement(By.xpath("//input[@class='autocomplete__input autocomplete__input--default']"));
		 streetadd.sendKeys("8133 leesburg pike");
		 WebElement suite=driver.findElement(By.id("locations-aptstefloor"));
		suite.click();
		Select s=new Select (suite);
		s.selectByValue("STE");
		WebElement snumber=driver.findElement(By.id("locations-aptstefloornumber"));
		snumber.sendKeys("220");
		 Thread.sleep(6000);
		 WebElement zipcode=driver.findElement(By.xpath("//*[@pattern='(\\d{9}$|(^\\d{5}[-]?(\\d{4})?$))|(^[ABCEGHJKLMNPRSTVXYabceghjklmnprstvxy]{1}\\d{1}[A-Za-z]{1} *\\d{1}[A-Za-z]{1}\\d{1})']"));
		 zipcode.sendKeys("22182");
		 Thread.sleep(6000);
		 WebElement submit=driver.findElement(By.xpath("//input[@class='button button-large']"));
		 submit.click();
		 Thread.sleep(6000);
		 WebElement createownpizza=driver.findElement(By.xpath("//*[text()=' ORIGINAL CRUST ']"));
		 createownpizza.click();
		 Thread.sleep(6000);
		 WebElement size=driver.findElement(By.xpath("//*[text()='Small']"));
		 size.click();
		 Thread.sleep(6000);
		/*WebElement ogc=driver.findElement(By.xpath("//*[text()='Original Crust']"));
		ogc.click();*/
	
	WebElement sauce=driver.findElement(By.xpath("//*[@class='custom-control-input'and @value='731']"));
	sauce.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
