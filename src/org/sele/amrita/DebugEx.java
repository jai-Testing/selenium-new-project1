package org.sele.amrita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugEx {   // f6 to step by step

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			
				driver.get("https:en-gb.facebook.com/"); // breakpoint used here
				driver.manage().window().maximize();
				
				driver.findElement(By.id("email")).sendKeys("jai");
				driver.findElement(By.id("pass")).sendKeys("kumar");
				
				driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]")).click();
	}

}
