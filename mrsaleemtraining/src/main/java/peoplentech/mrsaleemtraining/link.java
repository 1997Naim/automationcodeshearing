package peoplentech.mrsaleemtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimu\\eclipse-workspace\\mrsaleemtraining\\src\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 driver.manage().window().maximize();
		 
		 List<WebElement> link= driver.findElements(By.tagName("a"));
		 System.out.println("this is the size of link="+link.size());
		 for(int i=0;i<link.size();i++) {
			 System.out.println(link.get(i).getText());
		 }
	}

}
