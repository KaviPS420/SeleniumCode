package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysNote {
	static WebDriver driver;

	public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	String name = "Kavithamani";
	String designation = "SDET";
	StringBuilder sb = new StringBuilder("Selenium");
	StringBuffer sf = new StringBuffer("notes");
	driver.findElement(By.id("input-firstname")).sendKeys(name,designation,sb," ",sf );
	String nameValue = driver.findElement(By.id("input-firstname")).getAttribute("value");
	System.out.println(nameValue);
	
	
	
	

	}

}
