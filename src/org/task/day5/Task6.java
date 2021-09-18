package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.xpath("//div[@class='Header3__groupItem hide--sm']")).click();
		
		WebElement mo = driver.findElement(By.xpath("(//li[@class='SimpleFlyout__listItem'])[3]"));
		a.moveToElement(mo).perform();
		mo.click();
		
		driver.findElement(By.xpath("(//li[@class='SimpleFlyout__listItem'])[13]")).click();
		
		
	}

}
