package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {
	@Test()
	public void Navigate() throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
    driver.navigate().back();

	}
	

}
