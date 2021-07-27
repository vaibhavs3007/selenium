package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popups1 {
@Test
public void alertpopups() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	String s = driver.switchTo().alert().getText();
	System.out.println("alert popup text :" + s);
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	String s1 = driver.switchTo().alert().getText();
	System.out.println("comfirm popup text :" + s1);
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	WebElement element = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	element.click();
	String s2 = driver.switchTo().alert().getText();
	System.out.println("prompt popup text : " +s2 );
	Thread.sleep(1000);
	Alert alert= driver.switchTo().alert();
	Thread.sleep(1000);
	alert.sendKeys("Vaibhav");
	
driver.switchTo().alert().accept();
		
	}
}