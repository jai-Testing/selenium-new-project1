package org.task.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse workspace\\SeleniumGT\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Actions a=new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement hmetxt = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]"));
		
		a.moveToElement(hmetxt).perform();
		
		WebElement subtxt = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]"));
		a.moveToElement(subtxt).perform();
		
		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]")).click();
		
		System.out.println("operation finished");
	}

}
