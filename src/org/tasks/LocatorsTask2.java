package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	System.out.println("Browser opened");
	driver.get("https://www.facebook.com/");
	
	System.out.println("Facebook opened");
	
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("jaikumar");
	
	WebElement txtpass = driver.findElement(By.name("pass"));
	txtpass.sendKeys("665788878");
	
	WebElement clickbtn = driver.findElement(By.name("login"));
	clickbtn.click();
	
	}

}
