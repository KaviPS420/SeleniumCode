package SeleniumBegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforMultipleElements {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By topLinks = By.cssSelector("div#navbar-collapse a");
		
	

	}
	
	public static List <WebElement> waitForPresenceOfElementsLocated(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
	}
	
	public static Boolean waitForvisibilityOfAllElements(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		 return  wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		
	}

}
