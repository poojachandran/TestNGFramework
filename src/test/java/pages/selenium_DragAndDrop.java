package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class selenium_DragAndDrop {

	WebDriver driver = null;
	Actions action = null;

	By droppable_menu = By.linkText("Droppable");
	By demo_frame = By.className("demo-frame");
	By draggable_box = By.id("draggable");
	By droppable_box = By.id("droppable");
	By dropped_text = By.xpath("//div[@id='droppable']//p");

	public selenium_DragAndDrop(WebDriver driver) {
		this.driver = driver;
	}

	public void clickDroppableMenu() {
		driver.findElement(droppable_menu).click();
	}

	public void dragAndDrop() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(demo_frame));
		WebElement src = driver.findElement(draggable_box);
		WebElement destn = driver.findElement(droppable_box);
		action = new Actions(driver);
		action.dragAndDrop(src, destn).perform();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(dropped_text).getText(), "Dropped!");
	}
}
