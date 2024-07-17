package SeleniumBegins;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniMAXandDimension {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Dimension dia = new Dimension(360,740);
		driver.manage().window().setSize(dia);
		driver.get("https://classic.crmpro.com/");
		

	}

}
