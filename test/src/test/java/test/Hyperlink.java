package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hyperlink {
@Test
public void Hyperlink() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://www.leafground.com/home.html");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("HyperLink")).click();
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.findElement(By.linkText("HyperLink")).click();
	
    driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
    driver.get("http://www.leafground.com/home.html");
	driver.findElement(By.linkText("HyperLink")).click();
    driver.findElement(By.linkText("Verify am I broken?")).click();
  
    driver.get("http://www.leafground.com/home.html");
	driver.findElement(By.linkText("HyperLink")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/a")).click();
	driver.get("http://www.leafground.com/pages/Link.html");
	driver.findElement(By.linkText("How many links are available in this page?")).click();
}
}