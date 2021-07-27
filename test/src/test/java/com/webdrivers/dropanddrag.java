package com.webdrivers;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 

public class dropanddrag {
    
@Test
    public void script1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/drop.html");
        Actions drop=new Actions(driver);
        WebElement dra=driver.findElement(By.id("draggable"));
        WebElement dop=driver.findElement(By.id("droppable"));
        drop.dragAndDrop(dra, dop).perform();
        
        //drag the element to an axis.
        driver.navigate().to("http://www.leafground.com/pages/drag.html");
        WebElement a=driver.findElement(By.id("draggable"));
        Actions drag=new Actions(driver);
        drag.moveToElement(a, 473, 217).build().perform();
}
}