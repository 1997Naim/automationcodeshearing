package peoplentech.mrsaleemtraining;

import org.testng.annotations.Test;

import commoncodes.utility;
import myfacebook.homeoffb;

import org.testng.annotations.DataProvider;

public class dataprovider extends utility {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  homeoffb home=new homeoffb(driver);
	  home.emailsend(n);
	  Thread.sleep(1000);
	  home.passsend(s);
	  Thread.sleep(1000);
	  home.logbc();
	  Thread.sleep(1000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "naimchpwdhury.oo@gmail.com", "abch" },
      new Object[] { "ismam", "vxbxh" },
      new Object[] { "mefta", "sbbdfvgjasdv" },
    };
  }
}
