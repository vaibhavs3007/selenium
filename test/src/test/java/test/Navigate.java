package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate {
@Test
public void navigate() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//back
	driver.navigate().back();
	System.out.println("gets back to the previous page");
	Thread.sleep(1000);
	//Forward
	driver.navigate().forward();
	System.out.println("getback to the original page");
	Thread.sleep(1000);
	//refresh
	driver.navigate().refresh();
	System.out.println("Page refreshed");
	driver.navigate().to("http://www.leafground.com/");
	
	//get commands
	String s = driver.getCurrentUrl();
	System.out.println("Currentpage url:"+s) ;
	String str = driver.getPageSource();
	System.out.println("source code of current page :" + str);
}
}