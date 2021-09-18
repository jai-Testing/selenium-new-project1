package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebElement txtUser = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));

		txtUser.sendKeys("iphone");

		WebElement txtPass = driver.findElement(By.xpath("//input[@type=\"password\"]"));

		txtPass.sendKeys("mobile");

		System.out.println(txtUser.getAttribute("value"));
		System.out.println(txtPass.getAttribute("value"));

		driver.close();
	}

}
