package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8D3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		driver.findElement(By.className("newUserRegister")).click();
		
		driver.findElement(By.className("col-xs-24 clickOnceOnly")).sendKeys("786576656");
		
		driver.findElement(By.className("btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30")).click();
		
	}

}
