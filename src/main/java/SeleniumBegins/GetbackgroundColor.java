package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetbackgroundColor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']" ));
		String str = loginBtn.getCssValue("background");
		System.out.println(str);
			

	}

}
