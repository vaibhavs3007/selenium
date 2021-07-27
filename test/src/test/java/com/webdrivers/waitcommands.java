package com.webdrivers;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

 

public class waitcommands {
    public class checkbox {
        
        @Test
        public void script1() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            
            
            //get commands
            driver.get("http://www.leafground.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getPageSource());
            
            //navigate commands
            driver.navigate().to("http://www.leafground.com/pages/disapper.html");
            
            
            
            //Explicit wait command
            WebDriverWait expli_wait=new WebDriverWait(driver,5);
            expli_wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("strong"),"I know you can do it! Button is disappeared!"));
            
            
            driver.navigate().back();
            
            //implicit wait and check the element is present or not
            driver.navigate().to("http://www.leafground.com/pages/appear.html");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement selectedbutton=driver.findElement(By.xpath("//div[@class='flex']/button[5]"));
            System.out.println(selectedbutton.getText());
            
            //explicit wait use in leafground application in wait for text change
            
            driver.navigate().to("http://www.leafground.com/pages/TextChange.html");            
            WebDriverWait expli_wait2=new WebDriverWait(driver,10);
            expli_wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"));
            driver.findElement(By.id("btn")).click();
            Alert alert=driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            driver.close();
            
            
                
                      
                      

 

                   
            
            
            

 

}
}
}