package SeleniumBegins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CostocoTravel {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costcotravel.com/");
		By destination = By.id("hotel_package_destination");
		By dDate = By.id("departureDateWidget");
		By rtnDate =By.id("returnDateWidget");
		By rooms = By.xpath("]//select[@class='numberOfRoomsWidget']");
		By from = By.id("departureCityTextWidget");
		By fromx = By.xpath("//li[@class='airport selected']");
		By search = By.xpath("//div[@id='vpSearchSubmitId']/button[@class='btn btn-submit']");
		
		ElementUtil eutil = new ElementUtil(driver);
		
		eutil.getElement(destination).sendKeys("Paris");
		Thread.sleep(3000);
		List <WebElement> eleli = driver.findElements(By.xpath("//ul[@class='ui-list']/li"));
		List <String> eletext = new ArrayList<String>();
		for(WebElement e: eleli) {
			String text= e.getText();
			eletext.add(text);
			
		}
		System.out.println(eletext);
		
		eutil.getElement(dDate).sendKeys("07/23/2024");
		eutil.getElement(rtnDate).clear();
		eutil.getElement(rtnDate).sendKeys("07/30/2024");
		eutil.getElement(from).sendKeys("Seattle");
		Thread.sleep(400);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(search)).click().perform();
		eutil.getElement(search);
		driver.getTitle();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
