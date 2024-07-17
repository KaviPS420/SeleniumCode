package Mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest{
	
	@Test
	public void LoingPageTitleTest() {
		System.out.println("Login page Title");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login", "Title is not match in Login page");
		
	}
	@Test
	public void LoginPageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://naveenautomationlabs.com/opencart/index.php?route=account/login", "url not match");
		
	}
	@Parameters({ "username", "password" })
	@Test
	public void loingTest(String username , String password) {
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String title = driver.getTitle();	
		System.out.println(title);
		Assert.assertEquals(title, "My Account", "Title is not match after login");
	}
	
	@DataProvider
	public Object[][]getSearchData(){
		return new Object[][] {
			{"macbook"}
		};
	}
	@Test(dataProvider= "getSearchData")
	public void searchMac(String searchkey1) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(searchkey1);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.scrollToElement(driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']"))).click(driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']"))).perform();		
		//driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
	}
	@DataProvider
	public Object[][]getmacbook(){
		return new Object[][] {
			{"macbook" }
		};
	}
	@Test(dataProvider= "getmacbook")
	public void searchAir(String key2 ) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(key2);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.scrollToElement(driver.findElement(By.xpath("//a[normalize-space()='MacBook Air']"))).click(driver.findElement(By.xpath("//a[normalize-space()='MacBook Air']"))).perform();
		//driver.findElement(By.xpath("//a[normalize-space()='MacBook Air']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("1");
		driver.findElement(By.id("button-cart")).click();
		
	}
	@DataProvider
	public Object[][]getSearchimac(){
		return new Object[][] {
			{"imac"}
		};
	}
	@Test(dataProvider= "getSearchimac")
	public void searchimac(String key3) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(key3);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='iMac']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
	}
	
	@DataProvider
	public Object[][]getsamsung(){
		return new Object[][] {
			{"samsung"}
		};
	}
	@Test(dataProvider= "getsamsung")
	public void searchSamsung(String key4 ) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(key4);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Samsung SyncMaster 941BW']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("1");
		driver.findElement(By.id("button-cart")).click();
		
	}
	
	
	
	
}
