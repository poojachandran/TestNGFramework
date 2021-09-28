package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.selenium_MultipleSelect;

public class selenium_MultipleSelect_test {

	WebDriver driver = null;

	@BeforeClass
	public void setUp() {
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver",
				projectPath+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void multipleSelect_test_method() throws Exception {

		driver.get("https://jqueryui.com/");
		Thread.sleep(1000);

		/*To maximize window*/
		driver.manage().window().maximize();

		selenium_MultipleSelect pages = new selenium_MultipleSelect(driver);

		pages.clickSelectableMenu();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		pages.switchToDemoFrame();
		Thread.sleep(1000);
		pages.multipleSelect();
	}

	@AfterClass
	public void tearDown() {
		/*Closing the browser*/
		driver.close();
	}
}
