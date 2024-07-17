package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele = driver.findElement(By.xpath("//span [text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

}
