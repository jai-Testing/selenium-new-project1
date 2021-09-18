package org.task.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		WebElement frstMosOvr = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		a.moveToElement(frstMosOvr).perform();
		
		Thread.sleep(3000);
		WebElement frstMosOvr1 = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(frstMosOvr1).perform();

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\GreensFldr1\\jai\\subfldr\\flipkart.png");
		FileUtils.copyFile(screenshotAs, des);
		
	}

}
