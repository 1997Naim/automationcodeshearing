package myfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {
	public WebDriver driver;
	@FindBy(xpath = "//*[@class='inputtext _58mg _5dba _2ph-'and @name='firstname']")WebElement firstname;
	@FindBy(xpath = "//*[@class='inputtext _58mg _5dba _2ph-'and @name='lastname']")WebElement lastname;
	@FindBy(xpath = "//*[@class='inputtext _58mg _5dba _2ph-'and @name='reg_email__']")WebElement email;
	@FindBy(xpath = "//*[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__']")WebElement newpassword;
	@FindBy(xpath = "//*[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email_confirmation__']")WebElement reenteremail;
	@FindBy(id="month")WebElement month;
	@FindBy(id="day")WebElement day;
	@FindBy(id="year")WebElement year;
	@FindBy(xpath = "//*[@name='sex'and@value='2']")WebElement gender;
	@FindBy(xpath = "//*[text()='Sign Up'and@name='websubmit']")WebElement signup;
	public fbsignup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void firstnamesendk() {
	firstname.sendKeys("naim");
}
public void lastnamesendk() {
	lastname.sendKeys("chowdhury");
}
public void emailsendk() {
	email.sendKeys("naimulnaim97@gmail.com");
}
public void npasswordsendk() {
	newpassword.sendKeys("1997Naim");
}
public void reemail() {
	reenteremail.sendKeys("naimulnaim97@gmail.com");
}
public void inputmonth() {
	Select ob=new Select(month);
	ob.selectByValue("3");
}
public void inputday() {
	Select ob1=new Select(day);
	ob1.selectByValue("3");
}
public void inputyear() {
	Select ob2=new Select (year);
	ob2.selectByValue("1997");
}
public void genderclick() {
	gender.click();
}
public void signupclick() {
signup.click();
}

}
