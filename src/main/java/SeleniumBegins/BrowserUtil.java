package SeleniumBegins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil  {
	

	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		
		switch (browserName.trim().toLowerCase()) {
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
			throw new BrowserException("Pass proper exception" + browserName);
			
		}
		
		return driver;
	}
	
	public void launchUrl(String url) {
		
		if (url == null) {
			throw new BrowserException("Null url");
			
		}
		if(url.isBlank()||url.isEmpty()) {
			throw new BrowserException("Blank or Empty url");
		}
		
		if(url.indexOf("http")!=0 || url.indexOf("http")>0) {
			throw new BrowserException("https is missing in url" + url);
		}
		
		driver.get(url.trim());
		
	}
	
	
	public String getPageTitle() {
		String title = driver.getTitle();
		if(title == null) {
			System.out.println("Title is empty");
		}
		return title;
	}
	
	public void closeDriver() {
		driver.close();
	}
	
	public void quitDriver() {
		driver.quit();
	}
	
	
	
	
	
}
