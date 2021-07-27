package test;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandling {

	@Test
	public void Windows() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> i = window.iterator();
		
		String w1 = i.next();
		String w2 = i.next();
		driver.switchTo().window(w2);
		String s = driver.getTitle();
		System.out.println("second window title :" + s);
		Thread.sleep(2000);
		driver.close();
		//2nd window
		/*Thread.sleep(5000);
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();*/
	}
}