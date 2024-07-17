package SeleniumBegins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathconcept {

		static WebDriver driver;

		public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img[@loading='lazy']")).click();
		driver.switchTo().frame("frame-one748593425");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@id='q1']//input[@type='text']")).sendKeys("car");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Chennai");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("05/09/2024");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("This is iframe testing and registration form update");
		//driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("‪C:\\Users\\searumug\\Pictures\\Screenshots\\sendkeys\\all.png");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Kavi");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("PS");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("21 Maple valley");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("MV");
		List <WebElement> list = driver.findElements(By.cssSelector("select.drop_down>option[value^='Radio']"));
		int listcount = list.size();
		System.out.println(listcount);
		for(WebElement e: list) {
			String text = e.getText();
			System.out.println(text);
		}
		
				Select selectCon = new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
				selectCon.selectByValue("Radio-12");
		driver.findElement(By.cssSelector("#RESULT_TextField-14")).sendKeys("98045");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9786543210");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kavi@gmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
		
		
		

	}

}
