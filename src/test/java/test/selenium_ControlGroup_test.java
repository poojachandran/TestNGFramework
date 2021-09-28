package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.selenium_ControlGroup;

public class selenium_ControlGroup_test {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver",
				projectPath+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void controlGroup_test_Method() throws Exception {

		driver.get("https://jqueryui.com/");

		/*To maximize window*/
		driver.manage().window().maximize();
		Thread.sleep(1000);

		selenium_ControlGroup pagesObject = new selenium_ControlGroup(driver);
		pagesObject.clickControlGroupMenu();
		pagesObject.switchToDemoFrame();
		pagesObject.controlGroupSelection();
	}


	@AfterTest
	public void tearDown() {
		/*Closing the browser*/
		driver.close();
	}
}
