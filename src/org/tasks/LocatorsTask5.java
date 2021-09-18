package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("http://adactinhotelapp.com/");
		
		System.out.println("Facebook opened");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("jaikumar");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("665788878");
		
		WebElement clickbtn = driver.findElement(By.id("login"));
		clickbtn.click();
		
		
	}

}
