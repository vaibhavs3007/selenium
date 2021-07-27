package com.webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orderedlist {
    @Test
    public void script1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://www.leafground.com/pages/selectable.html");
    
        
        List<WebElement> e1=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
        
        int list1=e1.size();
        System.out.println(list1);
        
        
        
        Actions a=new Actions(driver); 
        a.keyDown(Keys.CONTROL)
         .click(e1.get(0))
         .click(e1.get(3))
         .click(e1.get(5)).build().perform();
         
}
    
}