package SeleniumBegins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		List <WebElement> list = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		System.out.println(list.size());
		for(WebElement e : list) {
			String text = e.getText();
			if(text.equals("Canada")) {
				System.out.println(text);
				break;
			}
			
		}
		
		
		
		Select selectCon = new Select(driver.findElement(By.id("Form_getForm_Country")));
		selectCon.deselectAll();
//		//selectCon.selectByValue("Angola");
//		//selectCon.selectByVisibleText("Central African Republic");
//		
//		List<WebElement> cCount = selectCon.getOptions();
//		System.out.println(cCount.size());
//		for(WebElement e : cCount) {
//			String text = e.getText();
//			System.out.println(text);
	//	}
		
	}

}
