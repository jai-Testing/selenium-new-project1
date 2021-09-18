package org.task.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\GreensFldr1\\jai\\subfldr\\iphone.png");
		FileUtils.copyFile(screenshotAs, des);
		System.out.println("Picture Saved ");
	}

}
