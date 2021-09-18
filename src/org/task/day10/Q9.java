package org.task.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\eclipse workspace\\\\SeleniumGT\\\\Drivers\\\\sub\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi phone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='REDMI 9i (Midnight Black, 64 GB)']")).click();
		Thread.sleep(3000);
		String parId = driver.getWindowHandle();
		System.out.println("Parent Id : "+parId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String allIds : allId) {
			
			if(!parId.equals(allId)) {
				driver.switchTo().window(allIds);
			}
		}
		
		
		WebElement txtprice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = txtprice.getText();
		System.out.println("Redmi Phone Rs : "+text);
	}

}
