package Feb2024SeleniumSessions.FirstSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotations {
@BeforeSuite
public void connectwithDB() {
	System.out.println("connect db");
}

@BeforeTest
public void createUser() {
	System.out.println("create user");
}
	
@BeforeClass
public void launchBrowser(){
	System.out.println("before class");
}
	
	
}
