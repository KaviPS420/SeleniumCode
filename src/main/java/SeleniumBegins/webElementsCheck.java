package SeleniumBegins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsCheck {

	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		//WebDriver driver = brUtil.launchBrowser("chrome");
		//brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(driver.getTitle());
		
		
		System.out.println("List of web elemets" +WebElements());
		
		

	}
	
	public static List<String> WebElements (){
		
		List <String> eleList = new ArrayList<String>();
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for (WebElement e : element) {
		String text = e.getText();
		eleList.add(text);
		}
		
 		return eleList;
		
	}

}
