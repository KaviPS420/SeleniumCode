package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.facebook.com/");
		System.out.println(brUtil.getPageTitle());
		//System.out.println();
		By email = By.id("email");
		By pass = By.id("pass");
		By login = By.name("login");
		By links = By.tagName("a");
		By image = By.tagName("img");
			
		ElementUtil eUtil = new ElementUtil(driver);
		
		
		System.out.println(eUtil.getElementsCount(links));
		System.out.println(eUtil.getElementsTextList(links));
		System.out.println(eUtil.doGetAttribute(image, "alt"));
		System.out.println(eUtil.doGetAttribute(email, "placeholder"));
		
		
		
		eUtil.doSendKeys(email, "Kavitha");
		System.out.println(eUtil.doGetAttribute(email, "value"));
		eUtil.doSendKeys(pass, "Kavitha@123");
		
		
		
		eUtil.doclick(login);
		driver.navigate().to("https://www.google.com/");
		System.out.println("Am in google    " + brUtil.getPageTitle());
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		System.out.println("Am in google    " + brUtil.getPageTitle());
//		System.out.println("This is after back " + brUtil.getPageTitle());
//		
		brUtil.closeDriver();
		

	}

}
