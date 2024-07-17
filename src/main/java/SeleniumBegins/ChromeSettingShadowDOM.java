package SeleniumBegins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings");
		String jsScript = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		WebElement ele = (WebElement)js.executeScript(jsScript);
		ele.sendKeys("language");
		Thread.sleep(6000);
		System.out.println(driver.getCurrentUrl());
		
		

		
		
		
		
		
		
		

	}

}
