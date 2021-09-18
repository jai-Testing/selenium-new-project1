package org.task.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'prompt ')]")).click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());

		a.sendKeys("jai");

		a.accept();

		System.out.println(a.getText());

	}

}
