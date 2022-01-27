package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class papajhons2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		JavascriptExecutor js=	(JavascriptExecutor)driver;
		 driver.navigate().to("https://www.papajohns.com");
		 driver.manage().window().maximize();
		 WebElement startyourorder=driver.findElement(By.xpath("//*[@data-track-click='top-nav|Start Your Order']"));
		 startyourorder.click();
		 Thread.sleep(2000);
		 WebElement country=driver.findElement(By.id("locations-country"));
		 country.click();
		 Select c=new Select(country);
		 c.selectByValue("usa");
		 Thread.sleep(2000);
		 WebElement addresstype=driver.findElement(By.id("locations-addresstype"));
		 addresstype.click();
		 Select add=new Select(addresstype);
		 add.selectByValue("HOME");
		 Thread.sleep(2000);
		 WebElement streetadd=driver.findElement(By.xpath("//input[@class='autocomplete__input autocomplete__input--default']"));
		 streetadd.sendKeys("8133 leesburg pike");
		 WebElement suite=driver.findElement(By.id("locations-aptstefloor"));
		suite.click();
		Select s=new Select (suite);
		s.selectByValue("STE");
		WebElement snumber=driver.findElement(By.id("locations-aptstefloornumber"));
		snumber.sendKeys("220");
		 Thread.sleep(2000);
		 WebElement zipcode=driver.findElement(By.xpath("//*[@pattern='(\\d{9}$|(^\\d{5}[-]?(\\d{4})?$))|(^[ABCEGHJKLMNPRSTVXYabceghjklmnprstvxy]{1}\\d{1}[A-Za-z]{1} *\\d{1}[A-Za-z]{1}\\d{1})']"));
		 zipcode.sendKeys("22182");
		 Thread.sleep(2000);
		 WebElement submit=driver.findElement(By.xpath("//input[@class='button button-large']"));
		 submit.click();
		 Thread.sleep(2000);
papajhons2 pj=new papajhons2();
pj.original();
Thread.sleep(2000);
pj.base();
pj.cheese();
pj.meats();
pj.veggies();
WebElement addtocart=driver.findElement(By.id("addProductToCart"));
addtocart.click();
Thread.sleep(3000);

}

public void original() throws InterruptedException {

	WebElement thnc=driver.findElement(By.xpath("//*[text()=' ORIGINAL CRUST ']"));
	thnc.click();
	
}
public void base () throws InterruptedException {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	WebElement size=driver.findElement(By.xpath("//*[@for='baseIngredientSize-1']"));
	size.click();Thread.sleep(3000);
js.executeScript("window.scrollBy(0,800)");
Thread.sleep(3000);
	WebElement sauce=driver.findElement(By.xpath("//*[@for='sauceType-1']"));
	sauce.click();Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(3000);
	WebElement cut=driver.findElement(By.xpath("//*[@for='cut-2']"));
	cut.click();Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	WebElement cook=driver.findElement(By.xpath("//*[@for='bake-1']"));
	cook.click();
	Thread.sleep(3000);
	
	}
public void cheese() throws InterruptedException {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	WebElement ch=driver.findElement(By.id("ngb-tab-1"));
	ch.click();
	Thread.sleep(3000);
	WebElement ac=driver.findElement(By.xpath("//*[@for='cheesePortion-1']"));
	ac.click();Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	WebElement typec=driver.findElement(By.xpath("//*[@for='54-selected']"));
	typec.click();
	Thread.sleep(3000);
	WebElement ec=driver.findElement(By.xpath("//*[@for='54-qty-extra']"));
	ec.click();Thread.sleep(3000);
}
public void meats() throws InterruptedException {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
WebElement Meat=driver.findElement(By.id("ngb-tab-2"));
Meat.click();
Thread.sleep(3000);
WebElement pepperoni=driver.findElement(By.xpath("//*[@for='35-selected']"));
js.executeScript("arguments[0].click();",pepperoni );
Thread.sleep(3000);
WebElement ap=driver.findElement(By.xpath("//*[@for='35-qty-extra']"));
ap.click();Thread.sleep(3000);
WebElement grilledchicken=driver.findElement(By.xpath("//*[@for='33-selected']"));
js.executeScript("arguments[0].click();",grilledchicken );Thread.sleep(3000);
WebElement agc=driver.findElement(By.xpath("//*[@for='33-qty-extra']"));
agc.click();
Thread.sleep(2000);
}
public void veggies() throws InterruptedException {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	WebElement Veggie=driver.findElement(By.id("ngb-tab-3"));
	Veggie.click();
	WebElement bananapapper=driver.findElement(By.xpath("//*[@for='30-selected']"));
	js.executeScript("arguments[0].click();", bananapapper );
	WebElement bps=driver.findElement(By.xpath("//*[@for='30-right']"));
	bps.click();
	Thread.sleep(2000);
	WebElement jalapenopapper=driver.findElement(By.xpath("//*[@for='29-selected']"));
	js.executeScript("arguments[0].click();",jalapenopapper );	Thread.sleep(2000);
	WebElement jpa=driver.findElement(By.xpath("//*[@for='29-qty-extra']"));
	jpa.click();
	Thread.sleep(2000);
}
}
