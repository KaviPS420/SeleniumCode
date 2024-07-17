package SeleniumBegins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeQuit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//sessionId	SessionId  (id=329)	

		
		driver.get("https://www.facebook.com");
		//de48f9be2f99944e85d4277f870bd444
		
		System.out.println(driver.getTitle());
		//de48f9be2f99944e85d4277f870bd444
		//driver.close();
		//de48f9be2f99944e85d4277f870bd444
		driver.quit(); 
		System.out.println(driver.getTitle());
		//invalid session id
		//Session ID is null. Using WebDriver after calling quit()?
	}

}
