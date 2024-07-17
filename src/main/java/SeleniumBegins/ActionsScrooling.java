package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrooling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.scrollToElement(driver.findElement(By.linkText("Contact Us"))).click(driver.findElement(By.linkText("Contact Us"))).perform();
		

	}

}
