package Feb2024SeleniumSessions.FirstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FirstTestCase {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.out.println("This is setup ");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
				
		
	}
	
	

}
