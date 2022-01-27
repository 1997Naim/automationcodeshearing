package peoplentech.mrsaleemtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class draganddrop {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://jqueryui.com/droppable");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
         WebElement drag=driver.findElement(By.id("draggable"));
	     WebElement drop=driver.findElement(By.id("droppable"));
	     Actions obj=new Actions(driver);
	     obj.dragAndDrop(drag,drop ).build().perform();
	     Thread.sleep(3000);
	     driver.switchTo().parentFrame();
	     WebElement resize=driver.findElement(By.linkText("Resizable"));
	     resize.click();
	
	
	
	
	
	}

}
