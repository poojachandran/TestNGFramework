package test;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.android_VerifyTitle;

public class android_VerifyTitle_test {

	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setUp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator_Pooja");
		cap.setCapability("udid","emulator-5554" );
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability("appPackage", "io.selendroid.testapp");		
		cap.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
	}

	@Test
	public void verifyTitle_test_method() throws Exception {
		
		android_VerifyTitle pagesObject = new  android_VerifyTitle(driver);
		Thread.sleep(1000);
		pagesObject.clickContinueButton();
		pagesObject.clickOkButton();
		pagesObject.verifyTitle();	
		
	}
	
	@AfterTest
	public void tearDown() {
		/*Closing the mobile application*/
		driver.close();
	}

}
