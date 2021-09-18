package org.task.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement txtusername = driver.findElement(By.id("username"));
	
		js.executeScript("arguments[0].setAttribute ('value','jaikumar')", txtusername);
	
	
		WebElement txtPass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','1234567')", txtPass);
		
		WebElement button = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", button);
	}

}
