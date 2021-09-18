package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4D3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\sub\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");

		
		driver.findElement(By.id("firstName")).sendKeys("jai");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		driver.findElement(By.id("userEmail")).sendKeys("kumar");
		
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("987654688");
		driver.findElement(By.id("submit")).click();
		
	}

}
