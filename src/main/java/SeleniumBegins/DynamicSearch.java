package SeleniumBegins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("macbook");
		Thread.sleep(3000);
		List<WebElement> rightList = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']"));
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//List <WebElement> rightList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		Thread.sleep(3000);	
		System.out.println(rightList.size());
		
		for(WebElement e : rightList) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
