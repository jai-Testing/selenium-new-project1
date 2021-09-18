package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2D3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jaikumar");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("8856");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
				
		
		
		
	}

}
