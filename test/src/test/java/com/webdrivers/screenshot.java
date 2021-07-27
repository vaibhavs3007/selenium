package com.webdrivers;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot {
    
	   @Test
	    public void script1() throws IOException, AWTException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Automation\\test\\Chrome\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Alerts.html");
	        TakesScreenshot scrs1=(TakesScreenshot) driver;
	           File Source=scrs1.getScreenshotAs(OutputType.FILE);
	           File destn=new File("C:\\Users\\Vaibhav\\Desktop\\vaibhav\\screen.jpg");
	          FileHandler.copy(Source, destn);
	         driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	         Robot robo1=new Robot();
	         java.awt.Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
	         Rectangle rect1=new Rectangle(screen_size);
	         BufferedImage Source1=robo1.createScreenCapture(rect1);
	         File destn2=new File("C:\\Users\\Vaibhav\\Desktop\\New folder (2)");
	         ImageIO.write(Source1, "jpg", destn2);
	         
	}
	}