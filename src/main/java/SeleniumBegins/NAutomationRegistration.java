package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NAutomationRegistration {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By tele = By.id("input-telephone");
		By pass = By.id("input-password");
		By pwdConf = By.id("input-confirm");
		By agree = By.name("agree");
		By submit = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(firstName, "Kavitha");
		eUtil.doSendKeys(lastName, "PS");
		eUtil.doSendKeys(email, "kavitha+0@gmail.com");
		eUtil.doSendKeys(tele, "9876543210");
		eUtil.doSendKeys(pass, "Test@123");
		eUtil.doSendKeys(pwdConf, "Test@123");
		eUtil.doclick(agree);
		eUtil.doclick(submit);
		System.out.println(brUtil.getPageTitle());
		
		

	}

}
