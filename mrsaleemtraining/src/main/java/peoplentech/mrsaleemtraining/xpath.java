package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.youtube.com");
		 driver.manage().window().maximize();
	
/*	WebElement id=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
	id.sendKeys("naimchowdhury.nc@gmail.com");
	WebElement password=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
	password.sendKeys("1997Naim@@");
	WebElement login=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	login.click();*/
	
	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	search.sendKeys("spiderman no way home");
	WebElement button=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	button.click();
	
}

public static void naim() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to("https://www.facebook.com");
	 driver.manage().window().maximize();

		WebElement id=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		id.sendKeys("naimchowdhury.nc@gmail.com");
		WebElement password=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		password.sendKeys("1997Naim@@");
		WebElement login=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();



















}
















}
