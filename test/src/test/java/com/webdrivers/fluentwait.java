package com.webdrivers;

 

import java.time.Duration;

 

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

 

public class fluentwait {
        
        @Test
        public void script1() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
        
    
         //use of fluent wait.
          driver.navigate().to("http://www.leafground.com/pages/appear.html");
         
           @SuppressWarnings("unused")
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
             .withTimeout(Duration.ofSeconds(10))
             .pollingEvery(Duration.ofSeconds(2))
             .ignoring(NoSuchElementException.class);
          
             WebElement selectedbutton=driver.findElement(By.xpath("//div[@class='flex']/button[5]"));
             System.out.println(selectedbutton.getText());
            
        
             
          
        

 

}
}