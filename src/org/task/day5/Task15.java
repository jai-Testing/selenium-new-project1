package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement mo = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		a.moveToElement(mo).perform();
		
		WebElement mo1 = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		a.moveToElement(mo1).perform();
		mo1.click();
	}

}
