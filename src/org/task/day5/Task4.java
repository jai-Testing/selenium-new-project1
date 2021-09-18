package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		driver.get("http://greenstech.in/selenium-course-content.html");		
		
		WebElement coursesbox = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(coursesbox).perform();
		Thread.sleep(2000);
		
		WebElement datawar = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(datawar).perform();
		
		
		
		
	}

}






















