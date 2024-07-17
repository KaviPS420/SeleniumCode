package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoIsDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By submitButton = By.id("submitButton");
		By term = By.name("agreeTerms");
		boolean flag = driver.findElement(submitButton).isDisplayed();
		System.out.println(flag);
		boolean flag2 = driver.findElement(submitButton).isEnabled();
		System.out.println(flag2);
		boolean flag3 = driver.findElement(term).isSelected();
		System.out.println(flag3);
		driver.findElement(term).click();
		boolean flag4 = driver.findElement(term).isSelected();
		System.out.println(flag4);
		boolean flag5 = driver.findElement(submitButton).isEnabled();
		System.out.println(flag5);
		
				
		

	}
	

}
