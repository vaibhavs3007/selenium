package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

public class frames{
    @Test

 

    public void script1() {
        
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/frame.html");
        //click the button inside a nested frame
        driver.switchTo().frame(0).findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();
        
        //clicking the nested frames
        WebElement frames2=driver.findElement(By.xpath("//iframe[@src='page.html']"));
        driver.switchTo().frame(frames2);
        WebElement frames3=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frames3).findElement(By.id("Click1")).click();
        driver.switchTo().defaultContent();
        
        //finding out total no of frames
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        
                
    
        
}
}