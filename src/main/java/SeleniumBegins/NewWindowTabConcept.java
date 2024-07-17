package SeleniumBegins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			String parentWindowID = driver.getWindowHandle();
//			System.out.println(parentWindowID);
			//driver.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
			Set<String> handles = driver.getWindowHandles();			
			Iterator<String> it = handles.iterator();			
			String parentWindowId = it.next();
			System.out.println("parent window id is: " + parentWindowId);			
			String childWindowId = it.next();
			System.out.println("child window id is: " + childWindowId);			
			//Switch to child Window Facebook
			driver.switchTo().window(childWindowId);
			System.out.println("child window title : " + driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
			driver.close();
			//Switch back to parent
			driver.switchTo().window(parentWindowId);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();			
			Set <String> handles1 = driver.getWindowHandles();
			Iterator <String> it1 = handles1.iterator();
			parentWindowId = it1.next();
			System.out.println("parent window id is: " + parentWindowId);			
			String childWindowId1 = it1.next();
			System.out.println("child window id is: " + childWindowId1);
			//switchig to child (LinkedIn) window
			driver.switchTo().window(childWindowId1);
			System.out.println("This is child url" + driver.getCurrentUrl());
			driver.close();
			//switch to parent
			driver.switchTo().window(parentWindowId);
			System.out.println("Back to parent ");			
			Thread.sleep(500);			
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();			
			Set<String> handels2 = driver.getWindowHandles();
			Iterator <String> it2 = handels2.iterator();
			parentWindowId = it2.next();
			System.out.println(parentWindowId);
			String childWindowId2 = it2.next();
			System.out.println(childWindowId2);			
			driver.switchTo().window(childWindowId2);
			System.out.println("This is child url" + driver.getCurrentUrl());			
			driver.close();
			driver.switchTo().window(parentWindowId);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
			Set <String> handles3 = driver.getWindowHandles();
			Iterator <String> it3 = handles3.iterator();
			parentWindowId = it3.next();
			String childWindowId3 = it3.next();
			driver.switchTo().window(childWindowId3);			
			System.out.println("This is child youtube url "+driver.getCurrentUrl());
			driver.close();
			driver.switchTo().window(parentWindowId);
			System.out.println("Back to parent window");
			
			
			
			
			

	}

}
