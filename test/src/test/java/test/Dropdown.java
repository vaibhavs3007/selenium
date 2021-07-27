package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
@Test
public void dropdowns() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Drop down")).click();
	Select s = new Select(driver.findElement(By.id("dropdown1")));
	s.selectByVisibleText("Loadrunner");
	Thread.sleep(1000);
	Select s1 = new Select(driver.findElement(By.name("dropdown2")));

	s1.selectByValue("2");
	Thread.sleep(1000);
	Select s2 = new Select(driver.findElement(By.id("dropdown3")));
     s2.selectByIndex(1);
}
}