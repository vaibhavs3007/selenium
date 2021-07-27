package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
@Test
public void Radiobutton1() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://www.leafground.com");
	driver.findElement(By.linkText("Radio Button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("yes")).click();
	System.out.println("yes radiobutton selected successfully");
	driver.findElement(By.id("no")).click();
	System.out.println("no radiobutton selected successfully");
	 Thread.sleep(1000);
     driver.findElement(By.name("news")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//input[@class='myradio'])[3]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//input[@class='myradio'])[4]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//input[@class='myradio'])[5]")).click();

}
}