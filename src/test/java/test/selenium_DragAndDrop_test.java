package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.selenium_DragAndDrop;

public class selenium_DragAndDrop_test {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver",
				projectPath+"/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void dragAndDrop_test_method() throws InterruptedException {

		driver.get("https://jqueryui.com/");

		/*To maximize window*/
		driver.manage().window().maximize();

		selenium_DragAndDrop pagesObject = new selenium_DragAndDrop(driver);

		pagesObject.clickDroppableMenu();		
		Thread.sleep(2000);
		pagesObject.dragAndDrop();
	}

	@AfterTest
	public void tearDown() {
		/*Closing the browser*/
		driver.close();
	}
}
