package com.webdrivers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unorderlist {
    @Test
    public void script1() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
       driver.get("http://demo.automationtesting.in/AutoComplete.html");
       
       driver.findElement(By.id("searchbox")).sendKeys("Ar");
       
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       
       
       //printing no of nation which having ur in the name
       List<WebElement> lstofnation=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
       
      lstofnation.size();
       
       System.out.println(lstofnation.size());
       
       for(WebElement value:lstofnation) {
           if (value.getText().equalsIgnoreCase("ARGENTINA")) {
               value.click();
               break;
           }
       }
       
       
       
       
         //print nation which is selected.
       System.out.println(driver.findElement(By.cssSelector(".ui-autocomplete-multiselect-item")).getText());
       
       
       
      
}
}
       
       
       