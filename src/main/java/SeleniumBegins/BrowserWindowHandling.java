package SeleniumBegins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href , 'youtube.com')]")).click();
		Set <String > handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(300);
			if(!parentWindowID.equals(windowId)) {
				driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
