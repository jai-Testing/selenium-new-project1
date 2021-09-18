package org.task.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
	
		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Curri-accordian\"]/div[10]/div[1]/h3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		Thread.sleep(3000);
	
	
	
	
	}

}
