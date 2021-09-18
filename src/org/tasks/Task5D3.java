package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5D3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");

		
		WebElement intqus = driver.findElement(By.xpath("//div[@id='heading20']"));
		intqus.click();
		String s = intqus.getText();
		System.out.println(s);
		
		driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]")).click();
	
	}

}
