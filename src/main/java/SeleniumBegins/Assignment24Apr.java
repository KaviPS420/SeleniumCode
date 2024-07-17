package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment24Apr {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(brUtil.getPageTitle());
		
		By links = By.tagName("a");
		
		ElementUtil eUtil = new ElementUtil(driver);
		System.out.println(eUtil.getElementsCount(links));
		System.out.println(eUtil.getElementsTextList(links));
		
		
	}

}
