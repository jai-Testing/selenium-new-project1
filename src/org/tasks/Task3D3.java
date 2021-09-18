package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3D3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("jaikumar");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jaikumar");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jaikumar");
		
		driver.findElement(By.id("submitbtn")).click();
	}

}
