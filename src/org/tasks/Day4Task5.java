package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.google.com/");
		
		WebElement txt = driver.findElement(By.name("q"));
        txt.sendKeys("greens velmurugan",Keys.ENTER);
      
        //Thread.sleep(3000);
	
	//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

}
