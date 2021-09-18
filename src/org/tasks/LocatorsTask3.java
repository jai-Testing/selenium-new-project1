package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://www.redbus.in/");
		
		System.out.println("Facebook opened");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("jaikumar");
		
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("665788878");
		
		WebElement clickbtn = driver.findElement(By.id("search_btn"));
		clickbtn.click();
		
		driver.close();
		
	}

}
