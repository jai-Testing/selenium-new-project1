package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https:en-gb.facebook.com/");

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("jai");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("kumar");
		
		System.out.println(txtEmail.getAttribute("value"));
		
		System.out.println(txtPass.getAttribute(""));
		System.out.println(txtPass.getAttribute("value"));
		
		driver.close();
	}

}
