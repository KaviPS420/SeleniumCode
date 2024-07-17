package SeleniumBegins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
				
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.scrollToElement(driver.findElement(By.xpath("//a[@data-track='ft_youtube']"))).click(driver.findElement(By.xpath("//a[@data-track='ft_youtube']"))).perform();
		Set<String> handles = driver.getWindowHandles();			
		Iterator<String> it = handles.iterator();			
		String parentWindowId = it.next();
		System.out.println("parent window id is: " + parentWindowId);			
		String childWindowId = it.next();
		System.out.println("child window id is: " + childWindowId);			
		//Switch to child Window Facebook
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());
		System.out.println("Title" +driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.close();
		//Switch back to parent
		driver.switchTo().window(parentWindowId);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
