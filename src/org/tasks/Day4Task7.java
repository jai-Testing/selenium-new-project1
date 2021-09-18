package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://adactinhotelapp.com/");

		WebElement txtUser = driver.findElement(By.id("username"));

		txtUser.sendKeys("9876465665");

		WebElement txtPass = driver.findElement(By.id("password"));

		txtPass.sendKeys("jaikumar");

		System.out.println(txtUser.getAttribute("value"));
		System.out.println(txtPass.getAttribute("value"));

		driver.close();
	}

}
