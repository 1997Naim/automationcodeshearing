package peoplentech.mrsaleemtraining;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commoncodes.utility;

public class listners extends utility implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((utility)result.getInstance()).driver;
		 Date dt=new Date();
		  System.out.println(dt);
		  String dt1= dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(dt1);
		  String local= System.getProperty("user.dir");
		File store=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(store,new File(local+"\\picture\\pass\\"+dt1+"shot1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((utility)result.getInstance()).driver;
		 Date dt=new Date();
		  System.out.println(dt);
		  String dt1= dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(dt1);
		  String local= System.getProperty("user.dir");
		File store=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(store,new File(local+"\\picture\\fail\\"+dt1+"shot1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
