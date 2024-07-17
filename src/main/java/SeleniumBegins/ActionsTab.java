package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTab {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys(Keys.TAB)
		.pause(300).sendKeys(Keys.TAB)
		.pause(400)
		.sendKeys("samsung phone").click().perform();
		String s = driver.getTitle();
		System.out.println(s);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.scrollToElement(driver.findElement(By.linkText("Check your Order Status"))).click(driver.findElement(By.linkText("Check your Order Status"))).perform();
	}

}
