package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		By menu = By.cssSelector("a.menulink");
		By course = By.linkText("COURSES");
		handleParentSubMenu(menu , course);

	}
	public static void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentLocator)).perform();
		Thread.sleep(3000);
		driver.findElement(childLocator).click();
		
	}

}
