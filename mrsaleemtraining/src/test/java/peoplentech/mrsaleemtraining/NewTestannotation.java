package peoplentech.mrsaleemtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestannotation {
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is bfmethod");
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is bfclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afclass");
  }
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("this is  bfmethod2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is bftest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is aftest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bfsuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afsuit");
  }
  @Test
  public void f6() {
	  System.out.println("this is test"); 

}
}
