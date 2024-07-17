package SeleniumBegins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {
		//pesudo classes:
		//::before :: after::Has
		// handled with javascript
		
		WebDriver driver = new ChromeDriver();
		
		String firstNameJSContent = 
			    "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
			  
			  String firstNameJSColor = 
			    "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color');";
			  
			  JavascriptExecutor js = ((JavascriptExecutor)driver);
				WebElement ele = (WebElement)js.executeScript(firstNameJSContent);
				

	}

}
