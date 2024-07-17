package SeleniumBegins;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By pricelink = By.linkText("Pricing");
		
		
		waitForElementVisibleWithFluentWait(pricelink,10,2);
		
				
	}
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int intervalTime) {
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("No Such Element***");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		}
}
