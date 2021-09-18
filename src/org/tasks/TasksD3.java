package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksD3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		}

}
