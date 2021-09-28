package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class android_VerifyTitle {

	AppiumDriver<MobileElement> driver = null;

	By continue_btn = By.id("com.android.permissioncontroller:id/continue_button");

	public android_VerifyTitle(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void clickContinueButton() {
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	}

	public void clickOkButton() {
		driver.findElementByClassName("android.widget.Button").click();
	}

	public void verifyTitle() {
		Assert.assertEquals(driver.findElementByClassName("android.widget.TextView").getText(),"selendroid-test-app");
	}

}
