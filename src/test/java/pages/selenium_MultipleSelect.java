package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class selenium_MultipleSelect {

	WebDriver driver = null;
	Actions action = null;

	By selectable_menu = By.linkText("Selectable");
	By demo_frame = By.className("demo-frame");
	By item_list = By.xpath(".//ol[@id='selectable']/li");

	public selenium_MultipleSelect(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSelectableMenu() {
		driver.findElement(selectable_menu).click();		
	}

	public void switchToDemoFrame() {
		driver.switchTo().frame(driver.findElement(demo_frame));
	}

	public void multipleSelect() {
		List<WebElement> listOfElements = driver.findElements(item_list);


		action = new Actions(driver);

		for (WebElement webElement : listOfElements) {
			action.keyDown(Keys.CONTROL);
			if (webElement.getText().trim().equals("Item 1") 
					|| webElement.getText().trim().equals("Item 3")
					|| webElement.getText().trim().equals("Item 7")) {				
				action.moveToElement(webElement).click().build().perform();
				Assert.assertEquals(webElement.getCssValue("background-color"), "rgba(243, 152, 20, 1)");
			}
		}
	}
}
