package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4MenuHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		//this is for menu handling from main menu to sub menu navigation or mouse action
		driver.get("https://www.bigbasket.com/");
		By level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		
		driver.findElement(level1).click();
		By level2 = By.linkText("Beverages");
		By level3 = By.linkText("Tea");
		By level4 = By.linkText("Green Tea");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(level3)).perform();
		Thread.sleep(500);
		driver.findElement(level4).click();
		
		
		
		
		

	}

}
