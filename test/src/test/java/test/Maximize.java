package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("");
     	 
     	     	//Resize current window to the set dimension
     	        driver.manage().window().maximize();
     	       
     	       //To Delay execution for 10 sec. as to view the maximize browser
     	        Thread.sleep(10000);
     	       
     	        //Close the browser
     	        driver.quit();
	}	
}