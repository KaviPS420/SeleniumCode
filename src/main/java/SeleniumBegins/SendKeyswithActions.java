package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyswithActions {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//WebElement ele =driver.findElement(By.name("search"));
		String searchKey = "Macbook";
		char ch[] = searchKey.toCharArray();
		Actions act = new Actions(driver);
		for(char c:ch) {
			act.sendKeys(driver.findElement(By.name("search")),String.valueOf(c)).pause(500).perform();
		}
		
		
		
	}

}
