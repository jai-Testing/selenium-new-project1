package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6D3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chennai");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jolerpettai");
		
		driver.findElement(By.id("trainFormButton")).click();
		
	}

}
