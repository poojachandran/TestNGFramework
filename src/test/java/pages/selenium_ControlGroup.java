package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class selenium_ControlGroup {

	WebDriver driver = null;

	By controlGroup_Menu = By.linkText("Controlgroup");
	By demo_frame = By.className("demo-frame");
	By dropDown1 = By.id("car-type-button");
	By option4 = By.xpath("//div[@role='option'][@id='ui-id-4']");
	By automatic1 = By.xpath("//label[@for='transmission-automatic']");
	By insurance1 = By.xpath("//label[@for='insurance']");
	By count1 = By.xpath("//input[@id='horizontal-spinner']");
	By dropDown2 = By.id("ui-id-8-button");
	By option14 = By.xpath("//div[@role='option'][@id='ui-id-14']");
	By automatic2 = By.xpath("//label[@for='transmission-automatic-v']");
	By insurance2 = By.xpath("//label[@for='insurance-v']");
	By count2 = By.xpath("//input[@id='vertical-spinner']");

	public selenium_ControlGroup(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToDemoFrame() {
		driver.switchTo().frame(driver.findElement(demo_frame));
	}

	public void clickControlGroupMenu() {
		driver.findElement(controlGroup_Menu).click();
	}

	public void controlGroupSelection() throws Exception {
		driver.findElement(dropDown1).click();
		driver.findElement(option4).click();
		driver.findElement(automatic1).click();
		driver.findElement(insurance1).click();
		driver.findElement(count1).sendKeys("2");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		driver.findElement(dropDown2).click();
		driver.findElement(option14).click();
		driver.findElement(automatic2).click();
		driver.findElement(insurance2).click();
		driver.findElement(count2).sendKeys("1");
		Thread.sleep(1000);
	}
}
