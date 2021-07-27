package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
@Test
public void checkboxnew() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Checkbox")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	
	//driver.findElement(By.xpath("//*[text()='Not Selected']")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	System.out.println("not selected checkbox selected");
	//driver.findElement(By.xpath("//*[text()='Option 1']")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
	System.out.println("option1 checkbox selected");
}
}