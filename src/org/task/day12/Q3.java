package org.task.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
       TakesScreenshot ts=(TakesScreenshot)driver;
       JavascriptExecutor js=(JavascriptExecutor)driver;
      
       WebElement ScrDwn = driver.findElement(By.xpath("//div[@id='heading304']"));
       js.executeScript("arguments[0].scrollIntoView(true)", ScrDwn);

       
	}

}
