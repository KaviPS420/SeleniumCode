package SeleniumBegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
	
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "chrome";
		
		
		switch (browser) {
		case "chrome":
			System.out.println("Chrome browser opening");
			 driver = new ChromeDriver();
			break;
		case "firefox":
			System.out.println("Firefox browser opening");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println("Edge browser opening");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please provide correct browser");
			break;
		}
		
		//
		//
		driver.get("https://www.facebook.com");
		

		
		String title = driver.getTitle();
		
		System.out.println(title);
		//verify title
		if (title.equals("Facebook - log in or sign up")) {
			System.out.println("Title is corect" + " " + title);
			
		}else {
			System.out.println("Title is not correct" +" " + title);
		}
		
		String url = driver.getCurrentUrl();
		//verify url
		if(url.equals("https://www.facebook.com/")) {
			System.out.println("Your url is correct");
		}else {
			System.out.println("Your URL is not correct");
		}
		
		driver.findElement(By.id("email")).sendKeys("Kavitha");
		driver.findElement(By.id("pass")).sendKeys("Kavitha@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//i[@class='_9ai6 img sp_vxiiSmFDFzJ sx_082a2e']")).click();
		
		//driver.close();
		
	}

}
