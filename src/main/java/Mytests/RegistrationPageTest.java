package Mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {
	

	public void registrationTitleTest() {
		System.out.println("Registration page Title");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Free CRM - CRM Pro for customer relationship management, sales, and support", "Title is not match in Login page");
		
	}
	@Test
	public void LoginPageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://classic.freecrm.com/register/", "url not match");
		
	}	
	
	@DataProvider
	public Object[][]createNewUserData(){
		return new Object[][] {
			{"Ruhi" , "S" ,"kavithapsmail+1@gmail.com" ,"RuhiSP", "Kavitha@123" , "AbCD" ,"9876543210" },
			{"Senthil" , "S" ,"kavithapsmail+2@gmail.com" ,"SenthilSP", "Kavitha@123","AbCDf","9876543510"},
			{"Ravi" , "S" ,"kavithapsmail+3@gmail.com" ,"RaviSP", "Kavitha@123","AbCDe","9876543230"},
			{"Athi" , "S" ,"kavithapsmail+4@gmail.com" ,"AthiSP", "Kavitha@123","AbCDf","9876578210"}
		};
		}
	
	@Test(dataProvider = "createNewUserData")
	public void Registration(String firstName , String lastName , String emailId , String userName , String password,String companyName , String phone) {
		By edtion = By.id("payment_plan_id");
		Select selectEdition = new Select(driver.findElement(edtion));
		selectEdition.selectByVisibleText("Free Edition");
	driver.findElement(By.name("first_name")).sendKeys(firstName);	
	driver.findElement(By.name("surname")).sendKeys(lastName);
	driver.findElement(By.name("email")).sendKeys(emailId);
	driver.findElement(By.name("email_confirm")).sendKeys(emailId);
	driver.findElement(By.name("username")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("passwordconfirm")).sendKeys(password);
	driver.findElement(By.name("agreeTerms")).click();
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.id("company_name")).sendKeys(companyName);
	driver.findElement(By.id("phone")).sendKeys(phone);
	driver.findElement(By.name("btnSubmit")).click();
	driver.findElement(By.name("finish")).click();
		
	}
	
	
	
	
	
	
	
	
	
}
