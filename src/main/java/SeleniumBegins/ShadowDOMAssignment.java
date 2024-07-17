package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//browser -> page ->shadowDOM -> iFrame ->element
		
		String jsScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		         
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement fram = (WebElement) js.executeScript(jsScript);        
        driver.switchTo().frame(fram);          
        System.out.println("Enter in to fram");
        driver.findElement(By.id("glaf")).sendKeys("MSIT");  
        driver.findElement(By.id("close")).click();
        driver.switchTo().defaultContent();
		
		
		
		

	}

}
